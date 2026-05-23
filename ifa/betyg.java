package ifa;

public class betyg { 
    public static void main(String[] args) {
        int slump = (int) (Math.random() *6); 
        System.out.println(slump + "kronor"); 
        if(slump==0){
            System.out.println(" Du fick betyget F");
        }else if(slump==1){
            System.out.println(" Du fick betyget E");
        }else if(slump==2){
            System.out.println(" Du fick betyget D");
        }else if(slump==3){
            System.out.println(" Du fick betyget C");
        }else if(slump==4){
            System.out.println(" Du fick betyget B");
        }else  if(slump==5){
            System.out.println(" Du fick betyget A");
        } 
    }

}
