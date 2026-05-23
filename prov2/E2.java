package prov2;
import java.util.Scanner;
public class E2 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Välkommen ange din ålder: "); 
        int old = sc.nextInt();
        if(20<=old && 65>=old){
            System.out.println("Du ska betala 100kr");
        }else{
            System.out.println("Du ska betala 50kr");
        }System.out.println();
    }

}
