package ovn; 
import java.util.Scanner;

public class ovningar2 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    System.out.print("Ange ordet på Svenska:"); 
    String ord = input.nextLine(); 
    System.out.println("Ange ordet på Eng: ");
    String namn = input.nextLine(); 
    System.out.println("svenska:" + " "+ ord + "\nEngelska:" + " " + namn);

}
}
