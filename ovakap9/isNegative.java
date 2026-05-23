package ovakap9;

public class isNegative { 
    public static void main(String[] args) { 
        System.out.println(isNegative(-3));
        
    } 

    static boolean isNegative(int tal){ 
        
        

        if (tal > 0) {
            return true;
            
        }if (tal<0) { 
            return false; 
            
        }
        return false;
    }

}
