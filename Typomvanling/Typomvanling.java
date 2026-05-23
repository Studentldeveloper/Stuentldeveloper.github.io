package Typomvanling;

public class Typomvanling {
public static void main(String[] args) {
    
    int i = (int) 5.9;  // explecittypomvanling till int kapar decimaler 
    
    String s="6";
    
    i =Integer.parseInt("6"); 
    String s1="3.5"; 
    double tal= Double.parseDouble(s1); 

    int k =Integer.valueOf("333"); 
    
    System.out.println("tal" + k);

}    

}
