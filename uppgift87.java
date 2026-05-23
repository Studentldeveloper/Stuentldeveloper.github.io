import java.util.Scanner;
public class uppgift87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println(" Beräkna produkten av två tal: "); 
        System.out.println("Tryck j för att starta: "); 

        char fortsätt = sc.next().charAt(0); 

        int tal1 , tal2; 
        while(fortsätt == 'j'){
            System.out.print("Tal1" + " "); tal1 = sc.nextInt(); 
            System.out.print("Tal2" + " "); tal2 = sc.nextInt(); 

            System.out.println(tal1 + "*" + tal2 + "=" + (tal1*tal2)); 

            System.out.print("Fortsätt? (j/J/n):" ); 
            fortsätt = sc.next().charAt(0);
        } 
        while( fortsätt == 'J'){
            System.out.print("Tal1" + " "); tal1 = sc.nextInt(); 
            System.out.print("Tal2" + " "); tal2 = sc.nextInt(); 

            System.out.println(tal1 + "+" + tal2 + "=" + (tal1+tal2)); 
            System.out.print("Fortsätt? (j/J/n):"); 
            fortsätt = sc.next().charAt(0);
        }
    }

}
