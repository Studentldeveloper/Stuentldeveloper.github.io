import java.util.Scanner;

public class upp46 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Ange antal timmar: ");
        int timmar = sc.nextInt(); 

        System.out.print("Ange antal minuter:");
        int minuter = sc.nextInt(); 

        System.out.print("Ange antal sekunder: "); 
        int sekunder = sc.nextInt();

        double timmar1 = (timmar*3600); 

        double minuter1 = (minuter*60); 


double stot=timmar1+minuter1+sekunder;


double mtot = stot/60;

double ttot=stot/60; 


        System.out.println("Tidsomvandlingen ger" + " "+ timmar1 + " "+ "h" +" "+ minuter1 + " "+ "min"+ " " + sekunder);


    }

}
