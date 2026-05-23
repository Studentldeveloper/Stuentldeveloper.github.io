package provmetoder;

public class intervall { 
    public static void main(String[] args) { 
        System.out.println("svaret är "+ intervall(6 ));
        
    } 
    static boolean intervall(int number){ 
        if(number>4 && number<11){
            return true;
        }else{
            return false; 
        }
    }
 
}
