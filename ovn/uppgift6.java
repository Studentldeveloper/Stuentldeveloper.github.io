package ovn;
import java.util.Scanner;
public class uppgift6 { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print(" Skriv namn ");
        String namn = input.nextLine(); 

        char firstLetter=namn.charAt(0);
        int mellanslag = namn.indexOf(' ');
        char secondLetter=  namn.charAt(mellanslag+1);
        System.out.println(namn + " " + "har initialerna" + " "+ firstLetter + "-" + secondLetter);

       




    }

}
