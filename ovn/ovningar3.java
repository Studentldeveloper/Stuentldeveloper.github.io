package ovn;
import java.util.Scanner;
public class ovningar3 {
public static void main(String[] args) {
    Scanner input = new  Scanner(System.in); 
    System.out.print("Ange substantiv: ");
    String namn = input.nextLine(); 

    System.out.print("Ange plural: ");
    String ord = input.nextLine();
    
    System.out.println("En" +" " + namn + "," + "flera" + " "+ ord);

}
}
