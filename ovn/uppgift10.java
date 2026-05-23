package ovn;

import java.util.Scanner;
public class uppgift10 { 
    public static void main(String[] args) {  
        Scanner scan = new Scanner(System.in);
        double tal1, tal2; 

        System.out.print("Mata in två heltal:");

        tal1 = scan.nextDouble(); 
        tal2 = scan.nextDouble(); 
        System.out.println( tal1 + "/" + tal2 + "=" + tal1/tal2); 
        System.out.println(tal1 + "%"+ tal2 + "=" + tal1%tal2); 
         
        
    }

}
