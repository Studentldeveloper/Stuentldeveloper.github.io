package katpitelupp9;

public class upp4 { 
    public static void main(String[] args) { 
        System.out.println(siffra('A'));
         
    } 

    static boolean siffra(char tecken){
        int i = tecken; 
        if(i <= 57&& i > 48){
            return true; 
        }else{
            return false; 
        }
    }

}
