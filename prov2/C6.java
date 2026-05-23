package prov2;

import java.util.Scanner;

public class C6 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ange vilken djur du gillar:"); 
        String djur = sc.nextLine();
    
        if( djur.equals("kanin")){
            System.out.println("du har valt en kanin"); 
            System.out.println();
        } else if (djur.equals("hund")) { 
            System.out.println("hunden är människans bästa vän");
            
        }else{
            System.out.println("du gillar ine djur");
        }
        
        } 

        
        
    }


