package ovakap9;

public class greet { 
    public static void main(String[] args) { 
        String text = greet("john"); 
        System.out.println(text);
        
    } 
    static String greet(String name){
        return "hej" + name;
    }

}
