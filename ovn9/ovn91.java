package ovn9;
import java.util.Scanner;

public class ovn91 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Ange radie");
        double r =sc.nextDouble();
        cylinderArea(r);

    }  
    public static void cylinderArea(double r){

        double area= Math.PI*Math.pow(r, 2); 
        System.out.println(area);
    }

}
