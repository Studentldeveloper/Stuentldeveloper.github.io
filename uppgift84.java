import java.util.Scanner;

public class uppgift84 { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int[]hastigheten= new int[50]; 
        System.out.print("Antal värden: "); 
         
        int antal = input.nextInt(); 

        for ( int n=0 ; n< antal ; n++){
            System.out.print("Ange tal" + n + ": ");
            hastigheten[n] = input.nextInt();  
        } 
        int max = hastigheten[0]; 
        for(int n = 0 ; n<antal ; n++){
            if(max<hastigheten[n]); 
        } 
        double summa=0; 
        for (int n =0 ; n<antal ; n++){
            summa = summa + hastigheten[n]; 
        } 
        int min = hastigheten[0]; 
        for( int n  =0 ; n> antal; n--){
            if(min>hastigheten[0]); 
        } 
        System.out.println(); 
        System.out.println("Största värdet: " + max); 
        System.out.println("Medelvärde:" + (summa/antal)); 
        System.out.println("Minsta värdet:" + min);
    } 

}