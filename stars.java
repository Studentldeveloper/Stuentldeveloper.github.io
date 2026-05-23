public class stars {  
    public static void main(String[] args) {
        box(2,2);
    }

    private static void box(int x, int y) { 

        for(int i =0; i<y; i++){

            for(int j=0; j<i; j++){ 
                System.out.print("*");

            }
            System.out.println("");

        }
        
    } 


}
