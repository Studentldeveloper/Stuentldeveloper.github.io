public class upp94 { 
    public static void main(String[] args) {
        char t = tecken(-10); 
        System.out.println(t);
    } 

    static char tecken(double tal){  

        char tecken; 

        if(tal<0){ 

            tecken= '-'; 


        }else{
            tecken = '+';
        }


        return tecken;
    }
 
}
