package ovn;
import java.util.Scanner;

public class uppgift5 { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("ange tal A:");
        int TalA = input.nextInt();
        System.out.print("ange tal B:");
        int TalB = input.nextInt();
        System.out.print("ange tal C:");
        int TalC = input.nextInt(); 
        int summa = (TalA + TalB + TalC);
        int medel = (TalA + TalB + TalC)/(3);
        System.out.println("summan är"+ " " + summa + " " + "medelvärdet är" + " "+ medel);
        
    }

}
