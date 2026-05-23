package ifa; 
import java.util.Scanner;

public class ovning74 { 
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);  
        System.out.println("Välkommen, ange din ålder är du snäll: "); 
        int age = scr.nextInt(); 
        if(age<=15 || age>=65){
            System.out.println("välkommen du ska betalar 5 kronor");
        } 
        else{
            System.out.println("Välkommen du ska betala 10 kronor");
        }

    }

}
