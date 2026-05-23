package katpitelupp9;



public class upp1 {
    public static void main(String[] args) { 

        double radie = 0.5; 
        
        double omkrets = OmkretsCirkel(radie); 

        System.out.println("Cirkelns radie är " + radie); 
        System.out.println("Cirkelns omkrets är " + omkrets);
        
    } 
    static double OmkretsCirkel (double radie){ 
        return 2*Math.PI*radie;

    }

}
