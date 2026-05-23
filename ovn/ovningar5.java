package ovn; 
import java.util.Scanner;

public class ovningar5 { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        System.out.print("ange önskad belopp: ");
        int belopp = input.nextInt();

        int uttag = ((belopp + 99)/100)*100; 
        int femhundra = uttag/500; 

        int resterande = uttag%500; 
        int hundra = resterande /100; 
        System.out.println("uttag i 500 sedlar: " + " " + (femhundra * 500) + " " + "kr");
        System.out.println("uttag i 100 sedlar: " + " " + (hundra * 100) + " " + "kr");
    }

}
