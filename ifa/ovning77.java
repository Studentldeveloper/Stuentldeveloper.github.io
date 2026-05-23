package ifa;

import java.util.Scanner;

public class ovning77 {  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        int val=1; 
        while (val>0 || val<5){

        } 
        System.out.println("1: uttag 2: insättning  3: saldo"); 
         val = sc.nextInt();

        switch (val) {
            case 1: 
                System.out.println("uttag");
                
                break; 
            case 2: 
                System.out.println("insättning");
            case 3: 
                System.out.println("saldo");        
        
            default:
                break;
        }
    }
    

}
