package ovn; 
import java.util.Scanner; 

public class ovningar1 { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Ange bas: ");
        Integer siffra = input.nextInt(); 

        System.out.println("Ange höjd: ");
        Integer höjd = input.nextInt(); 
        int area = (siffra *höjd)/2; 

        System.out.println("Arean är: " +" " + area);

    }

}
