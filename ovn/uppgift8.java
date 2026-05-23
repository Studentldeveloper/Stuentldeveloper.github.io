package ovn; 
import java.util.Scanner;

public class uppgift8 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("mata in tecknet:"); 
    String namn = input.nextLine(); 

    char tecken = namn.charAt(0);
    
    int kod = (int) tecken; 
    System.out.println("Tecken'"+ " " + "har koden"+" " + kod);

}
}
