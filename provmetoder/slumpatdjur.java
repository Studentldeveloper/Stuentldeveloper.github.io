package provmetoder;


public class slumpatdjur {  
    public static void main(String[] args) {   
        
        String[] djur= {"katt","elefant", "örn","häst", "snigel"  ,"krokodil"};  
        
        String djurord=slumpatdjur(djur);

         
        System.out.println(djurord);
    } 

    static  String slumpatdjur(String [] djur){  

        int slump = (int)(Math.random()*6);

        String ord=djur[slump];


        return ord;
    }

}
