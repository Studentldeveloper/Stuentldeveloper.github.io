package ovn9;
import java.util.Scanner;

public class ovn97 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Skriv en text"); 
        String text = sc.nextLine(); 
        int antalA = räknaTecken(text , 'a');  
        System.out.println("Antal a:" + antalA); 
        String omvänt = VändText(text); 
        System.out.println("omvänt blid" + omvänt);

    } 
    static int räknaTecken(String text, char tecken){ 
        int antal = 0; 
        for(int i =0; i<text.length(); i++){
            if(text.charAt(i)==tecken){
                antal++;
            }
        }
        return antal;
    } 
    static String VändText( String text){
        String omvänt = " ";  
        for ( int i =text.length() -1; i>=0; i--){
            omvänt += text.charAt(i);
        }
        return omvänt;

    }

}
