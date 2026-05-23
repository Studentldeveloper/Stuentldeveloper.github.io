package sistauppgifter;

public class uppgift82 { 
    public static void main(String[] args) {
        int[] tal = new int[5]; 
        for(int i =0 ; i<tal.length; i++){
            tal[i]= i+1; 
        } 
        for(int i = tal.length -1; i>=0; i--){
            System.out.println(tal[i]);
        }
    }

}
