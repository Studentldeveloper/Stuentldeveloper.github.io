document.querySelector(".search-container").addEventListener("submit", async (e) => {
    e.preventDefault();

    const input = document.getElementById("search").value;

    const [from, to] = input.split(" ");

    console.log("From:", from);
    console.log("To:", to);

    await searchFlights(from, to);
});


async function searchFlights(from, to) {

    // hårdkodade destinationer
    const url = "https://booking-com-api5.p.rapidapi.com/flight/find-roundtrip?languagecode=en&children=4%2C12&cabin_class=PREMIUM_ECONOMY&adults=1&page=1&from=JFK&to=CDG";

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

        const flights = data?.data?.flightOffers || data?.data || [];

        renderFlights(flights);

    } catch (error) {
        console.log("ERROR:", error);
    }
}




function renderFlights(flights) {

    const output = document.getElementById("output");

    if (!flights || flights.length === 0) {
        output.innerHTML = "<p>No flights found</p>";
        return;
    }

    output.innerHTML = flights.map(f => {

        const price =
            f?.priceBreakdown?.total?.units || "N/A";

        const from =
            f?.segments?.[0]?.departureAirport?.code || "N/A";

        const to =
            f?.segments?.[0]?.arrivalAirport?.code || "N/A";

        const airline =
            f?.segments?.[0]?.carrier?.name || "Flight";

        const bookingLink =
            "https://www.booking.com/flights";

        return `
            <a
                class="flight-card"
                href="${bookingLink}"
                target="_blank"
            >
                <h2>${airline}</h2>

                <p><b>From:</b> ${from}</p>

                <p><b>To:</b> ${to}</p>

                <p><b>Price:</b> ${price} €</p>

                <div class="book-btn">
                    Book Flight
                </div>
            </a>
        `;
    }).join("");
}


// hanterar videorna

const videos = document.querySelectorAll(".story-video");

function playSequence() {

    videos.forEach(v => {
        v.pause();
        v.classList.remove("active-video");
        v.currentTime = 0;
    });

    let times = [0, 7000, 13000, 19000, 22000];

    videos[0].classList.add("active-video");
    videos[0].play();

    setTimeout(() => switchVideo(0, 1), times[1]);
    setTimeout(() => switchVideo(1, 2), times[2]);
    setTimeout(() => switchVideo(2, 3), times[3]);
    setTimeout(() => switchVideo(3, 4), times[4]);

    setTimeout(() => {
        videos[4].classList.remove("active-video");
        playSequence();
    }, 28000);
}

function switchVideo(from, to) {
    videos[from].classList.remove("active-video");
    videos[from].pause();

    videos[to].classList.add("active-video");
    videos[to].play();
}

playSequence();