package ovn9;
import java.util.Scanner;

public class ovn96 { 
    static int antal; 

    public static void main(String[] args) {
        double[] tid = new double[100]; 
        inTid(tid); 
        utTid(tid); 
        System.out.println("snabbaste tiden är" + snabbTid(tid));
    } 
    static void inTid(double[]tid){
        Scanner sc = new Scanner(System.in); 
        System.out.println("skriv in tiderna. Avsluta med 0."); 
        antal = 0;
        double temp = sc.nextDouble(); 
        while (temp != 0 ) { 
            tid[antal] = temp; 
            antal ++; 
            temp = sc.nextDouble();

        }     
    } 
    static void utTid(double[] tid){ 
        System.out.print("Tiderna är: ");  

        for( int i=0 ; i<antal; i++){
            System.out.print(" " + tid[i]);
        }
        System.out.println();
      

    } 
    static double snabbTid(double[] tid){ 
        double snabbast = tid[0]; 
        for(int i=1; i<antal; i++){ 
            if(tid[i]<snabbast){ 
                snabbast = tid[i];

            }

        } 
        return snabbast;
        
    }
}
