import java.util.Scanner;

public class uppgift89 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int val; 
        int belopp = 1000; 
        do{
            System.out.println("\nMeny"); 
            System.out.println("1. Insättning: ");
            System.out.println("2. Uttag: "); 
            System.out.println("3. Visa behållning: "); 
            System.out.println("4. Avlsluta: "); 
            val= sc.nextInt(); 
            switch (val){
                case 1: 
                    System.out.print("Ange beloppet du vill sätta in:");
                    int insattning = sc.nextInt(); 
                    System.out.println("Det blir " + (belopp + insattning)); 
                case 2: 
                    System.out.println(" Ange önskad uttag belopp: ");
                    int onskad = sc.nextInt(); 
                    System.out.println("Kvar har du" + (belopp - onskad)); 
                case 3: 
                    System.out.println(" Du har " + belopp + "kr"); 
                case 4: 
                System.out.println("Ha en bra dag!");
                    
                    break;
            
                default:  
                    System.out.println("oglitlig val");
            } 
        
        }while (val != 4); 
        
        
    }
}