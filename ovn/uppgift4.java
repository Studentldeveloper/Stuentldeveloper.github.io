package ovn;
import java.util.Scanner;
public class uppgift4 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    System.out.print("ange din ålder: ");
    int ålder = input.nextInt();
    int kvot = (((ålder/10)*10)+10); 
    kvot = (int)kvot; 
    System.out.println( "din är "+ " " +ålder +" "+"Du fyller " + kvot + " " + "om "+ " " + (kvot - ålder)+ " " +"år"); 
    
}
}
