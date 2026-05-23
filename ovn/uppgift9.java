package ovn;
import java.util.Scanner;
public class uppgift9 { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("ange bokstaven: "); 
        String namn = input.nextLine(); 
        char storBokstav = namn.charAt(0); 

        char litenBokstav = Character.toLowerCase(storBokstav); 
        System.out.println("bokstaven blir" + " " + litenBokstav);


    }

}
