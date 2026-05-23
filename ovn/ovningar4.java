package ovn;
import java.util.Scanner;
public class ovningar4 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    System.out.print("ange önskad belopp: ");
    int belopp = input.nextInt();
    int uttag = ((belopp+99)/100)*100;
    System.out.println("uttag:" + " "+ uttag + " " + "kr");
}
}
