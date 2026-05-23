import java.util.Scanner;

public class upp5 { 
    public static void main(String[] args) {
        //problem: inläsning,beräkning,utskrift

        Scanner sc = new Scanner(System.in); 
        System.out.println("ange ett tal: "); 
        String tal = sc.nextLine();  

        int täljare =(int) tal.charAt(0);
        
        
        
        System.out.println(täljare);


    }

}
