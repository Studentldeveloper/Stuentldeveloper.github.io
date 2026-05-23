package katpitelupp9;

public class upp3 { 
    public static void main(String[] args) { 
        char t = tecken(-10); 
        System.out.println("du får" + t);
        
    } 
    static char tecken(double tal){
        char tecken; 
        if (tal<0){
            tecken='-';
        }else{
            tecken='+'; 

        } 
        return tecken;
    }

}
