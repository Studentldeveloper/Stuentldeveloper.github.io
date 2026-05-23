package array; 
import java.util.Scanner; 
import java.util.Arrays;

public class arloopn { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int[] number = new int[3]; 

        System.out.print("ange ett tal:"); 
        number[0]= sc.nextInt(); 

        System.out.print("ange ett tal:"); 
        number[1]= sc.nextInt(); 

        System.out.print("ange ett tal:"); 
        number[2]= sc.nextInt();  
        
        int temp = number[2]; 
        
        number[2] = number[0]; 
        number[0] = temp;

        
        
        System.out.println(Arrays.toString(number) );
        

        
    }

}
