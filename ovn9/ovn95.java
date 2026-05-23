package ovn9;
import inout.read; 
import java.util.Scanner;

public class ovn95 { 
    public static void main(String[] args) {  

        Scanner sc = new Scanner(System.in);

        System.out.println("Ange höjden:");  

        int höjd = sc.nextInt();

        ritaTriangel(höjd);
    } 
    static void ritaTriangel(int höjd){
        for(int i =1 ; i<=höjd; i++){
            for(int j =1 ; j <=höjd; j++){
                System.out.print("*");
            } 
            System.out.println();
        } 
        return;
    }

}
