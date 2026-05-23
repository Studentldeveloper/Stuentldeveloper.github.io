package sistauppgifter;

import java.util.Scanner;

public class uppgift83a { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print(" ange antal rader"); 
        int rader = sc.nextInt();
        System.out.print(" ange antal kolumner"); 
        int kolumn = sc.nextInt();
       
        for(int i=0; i<rader; i++){
            for(int j= 0; j<kolumn; j++){
                System.out.print("*");

            }
            
        }  
            System.out.println();

    }

}
