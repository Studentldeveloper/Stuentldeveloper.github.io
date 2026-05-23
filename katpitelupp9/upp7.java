package katpitelupp9;

import inout.read;

public class upp7 {
    public static void main(String[] args) {
        int number = 18; 
        if(primtal((number))){
            System.out.println(number + "är ett primtal"); 

        }else{
            System.out.println(number + " är inte ett primtal");
        }
    } 

    static boolean primtal( int tal){
        if (tal<=1){
            return false;
        } 
        for(int i =2 ; i<Math.sqrt(tal); i++){
            if( tal% i ==0){
                return false; 
            }
        } 
        return true; 
    }

}
