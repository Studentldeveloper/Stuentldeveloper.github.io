public class uppgift86 { 
    public static void main(String[] args) {
        double befolkningsmängd = 1000000; 
        double år = 0; 
        while(befolkningsmängd <= 2000000){
            befolkningsmängd = befolkningsmängd *1.05 ; år++; 
             
        }  
        
        System.out.println("Antal år: " + år);
    }

}
