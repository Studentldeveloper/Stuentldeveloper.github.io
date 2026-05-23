import java.util.Scanner;

public class lopp22 { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int start, slut, steg;   
        int i[]= new int[2];

        System.out.println("start:");  
        start = input.nextInt();


        System.out.println("Slut:"); 
        slut = input.nextInt();

        System.out.println("Steg:"); 
        
        steg = input.nextInt();  
        

        for(int n=start; n<slut; n = n+ steg){
            System.out.print(n + " ");
        }
    }

}
