package inout;
import java.util.Scanner; 

public class inread { 
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    
    System.out.println("ange ett tal"); 
        int tal=input.nextInt();
    double svar=Math.pow(tal,2); 
    System.out.println("svaret blir " + svar); 
    }
    
}
