import java.util.Scanner;
public class uppgift71 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        System.out.print("Ange din ålder: "); 
        
        int ålder = sc.nextInt();

        /* 
        String ålder = sc.nextLine();
        int ålder1 = Integer.parseInt(ålder);
        */
        if(ålder>=12){ 
            System.out.println("Din deltagande är godkänd");

        } 
        else{
            System.out.println("Du når inte ålderskrav, Tyvärr!!");
        }
 
    }
}
