package uppgifter;

import java.util.Scanner;

public class uppgift92 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Ge två tal:"); 
        System.out.print("Ange höjden");
        double tal1 = sc.nextDouble(); 
        double tal2 = sc.nextDouble();  
        double radie = sc.nextDouble(); 
        double minst = minst(tal1,tal2); 
        double V;
        System.out.println(minst + "är minst" + V); 

    } 
    public static double minst(double tal1 , double tal2) { 
        double min = tal1; 
        if(tal2<tal1){
            min = tal2; 
        }
        return min; 
        
    }
    public static double volymCylinder(double radie, double höjd){
        double V = Math.PI * Math.pow(radie, 2)*höjd; 
        return V;
        

    }
    

}
