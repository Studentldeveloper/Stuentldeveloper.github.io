package ovn;
import java.util.Scanner;
public class uppgift7 { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ange namn:"); 
        String namn = input.nextLine(); 
        int längd = namn.length(); 
        int mellanslag = namn.indexOf(' '); 
        String förnamn = namn.substring(0,mellanslag); 
        String efternamn = namn.substring(mellanslag+1,längd);  
        System.out.println("Förnamn:" +" "+ förnamn +"  "+ "\nEternamn:" +" "+ efternamn);

        
    }

}
