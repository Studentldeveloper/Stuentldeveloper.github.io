package sistauppgifter; 
import java.util.Scanner;

public class uppgift84 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int val; 
        int passagerare=0;
        do{
        System.out.println("/Meny");
        System.out.println("1. Nollsäll antalet passagerare");
        System.out.println("2. Öka antalet passagerare med en");
        System.out.println("3. Minska antalet passaggerare medn en");
        System.out.println("4. skriv ut antalet passaggerare"); 
        val= sc.nextInt(); 
        switch (val) {
            case 1:
                System.out.println("Det är 0 nu");
                break; 
            case 2: 
                System.out.println((passagerare +1));
            case 3: 
                System.out.println((passagerare-1)); 
            case 4: 
                System.out.println(passagerare);    
        
            default:
                System.out.println("ogiltigt");
        }
    }while (val != 0);{
        
    }
}
    

}
