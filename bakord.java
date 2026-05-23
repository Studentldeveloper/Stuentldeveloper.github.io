import java.util.Scanner;
public class bakord {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    System.out.print("ange ordet:"); 
    String ord = sc.nextLine(); 
    for( int  i = ord.length() -1 ; i >= 0; i --){ 
        System.out.print(ord.charAt(i));

    }

}
}
