package katpitelupp9;

public class upp2B { 
    public static void main(String[] args) {
        ritaromb(5);
    } 
    static void ritaromb(int höjd){
        for(int i = 0; i<höjd; i++){
            
            for(int j=0; j<i; j++){
               System.out.print(" ");
            }
             System.out.print("*****");
             System.out.println("");
        }
    }

}
