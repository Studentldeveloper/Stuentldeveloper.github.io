package ifa; 

import java.util.Scanner;

public class ovning76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hur många skivor vill du ha?"); 
        int antal = sc.nextInt();
        
        if(antal >= 10 && antal <= 49){ 

            double pris = antal * 9.9; 
            double pris1 = (pris * 0.05);  
            System.out.println(" Du har fått 5% rabbat" + "," + "Du ska betala: " + " "+ pris);

        } 
        if(antal >=50 && antal<= 99){
            double dyr = antal *9.9;
            double pris2 = (dyr * 0.1); 
            System.out.println(" Du har fått 10% rabbat" + "," + "Du ska betala:"+ " "+ pris2);
        } 
        if(antal >=100){
            double dyrare = (antal * 9.9); 
            double pris3 = (dyrare *0.15); 
            System.out.println(" Du har fått 15% rabbat" + "," + "Du ska betala" +" "+pris3);
        }
        if(antal <=9){
            double annars = (antal*9.9);  
            System.out.println("Du ska betala:" + " " + annars); 
        }

        }
    }
        
    


