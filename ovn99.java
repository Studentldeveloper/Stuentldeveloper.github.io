import java.util.Random;

public class ovn99 { 
    public static void main(String[] args) {
        Random rand = new Random(); 
        int antalsexor = 0; 

        for(int i=1; i<=6000; i++){ 

            int kast = rand.nextInt(6) + 1; 
            if(kast == 6){
                antalsexor++; 

            }

        } 
        System.out.println("Antal sexor vid 6000 kast: " + antalsexor);
    }

}
