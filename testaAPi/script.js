async function searchFlights() {

  const url = "https://booking-com-api5.p.rapidapi.com/flight/find-roundtrip?languagecode=en&children=4%2C12&cabin_class=PREMIUM_ECONOMY&adults=1&page=1&from=JFK&to=LAX";

  const options = {
    method: "GET",
    headers: {
      "Content-Type": "application/json",
      "x-rapidapi-host": "booking-com-api5.p.rapidapi.com",
      "x-rapidapi-key": "64f344dd24mshf797d71733cccafp1eecd7jsn504fa491d53c"
    }
  };

  try {
    const response = await fetch(url, options);
    const data = await response.json();

    console.log("API DATA:", data);

    // ❗ säkerhetscheck
    if (!data.success || !data.data || !data.data.flightOffers) {
      document.getElementById("output").innerHTML =
        "<p>Inga flyg hittades.</p>";
      return;
    }

    const offers = data.data.flightOffers;

document.getElementById("output").innerHTML = offers.map(f => {

  const price = f.priceBreakdown?.total?.units || "N/A";

  const from = f.segments?.[0]?.departureAirport?.code || "N/A";
  const to = f.segments?.[0]?.arrivalAirport?.code || "N/A";

  return `
    <div class="card">
      <h3>💰 Pris: ${price} €</h3>
      <p>🛫 Från: ${from}</p>
      <p>🛬 Till: ${to}</p>
    </div>
  `;
}).join("");

  } catch (error) {
    console.log("ERROR:", error);

    document.getElementById("output").innerHTML =
      "<p>Fel vid hämtning av flyg.</p>";
  }
}