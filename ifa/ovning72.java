package ifa; 
import java.util.Scanner;

public class ovning72 { 
    public static void main(String[] args) { 
        Scanner scr = new Scanner(System.in);  
        System.out.println("Hur mycket etanol finns det i tanken?"); 
        
        int etanol =scr.nextInt();
        
        if(etanol>= 10){
            System.out.println("Kör vidare");
        } 
        else{
            int kvar  = (50 - etanol); 
            
            double res = (kvar*9.50);  
            System.out.println("Du har " + etanol +" "+ "etanol"+" " + "fyll "+ " "+kvar +" "+"i tanken till 50, det kostar" + " " + res + "kr");

        } 
        
        
    }

}
