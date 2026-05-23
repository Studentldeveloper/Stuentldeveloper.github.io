public class valuta { 
    public static void main(String[] args) {
        //100 
        double kin=sekkin(100); 
        System.out.println(kin);
    }

    public static double sekkin(int sek){

        double kin = sek*0.76;
        return kin; 

    }

}
