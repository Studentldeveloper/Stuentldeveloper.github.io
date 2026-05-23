package ifa;

import java.util.Scanner;

public class ovning78 { 
    public static void main(String[] args) {
        
        String s1 = "Helena"; 
        String s2 = "anna";   
        if(s1.compareToIgnoreCase(s2)<0) { 
            System.out.println( s1+" kommer före" +s2); 

            
        } else{
            System.out.println("nej");
        }
        if(s1.compareTo(s2)>0) { 
            System.out.println( s2+" kommer före" +s1);
            
        }
        
     

    }

}
