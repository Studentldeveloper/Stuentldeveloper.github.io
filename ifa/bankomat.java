package ifa; 

import java.util.Scanner;

public class bankomat { 
    public static void main(String[] args) { 

        Scanner sc = new Scanner(System.in);  
        int val=1;  
        
         while(val>0 || val<5){

        }


        System.out.println("1: uttag 2: insättning 3: Saldo 4: dö");  
         val= sc.nextInt();
        

        

        



        switch (val) {
            case 1: 
                System.out.println("uttag");
                
                break;
            case 2:  
                System.out.println("insättning");
                break;
        
            default: 
                System.out.println("tack för din dag!");
                break;
        }
    }


}
