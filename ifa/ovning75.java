package ifa; 
import java.util.Scanner;

public class ovning75 { 
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);  
        
        System.out.println("Ange hoppets längd :");  
        double längd = scr.nextDouble();
        System.out.println("Ange vindens styrka");
        
         
        double styrka = scr.nextDouble(); 
        if(längd>7.92 && styrka<=2.0){ 
            System.out.println("Grattis");

        } 
        else{
            System.out.println("Tyvärr hoppets längd måste vara 7.92m lång samt vindens styrka ska vara mindre än 2.0 m/s");
        } 
    System.out.println(längd);

    }

}
