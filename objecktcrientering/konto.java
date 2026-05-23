package objecktcrientering;

public class konto { 
    private int saldo=0; 
    private int kontoNummer;  
    static double ränta = 1.05; 
    public konto(int s, int k){ 

        this.saldo = s; 
        this.kontoNummer = k; 

        System.out.println("du har skapat konto" + kontoNummer+"med saldot:" + saldo); 



    }  
    public void årsRänta(){
        this.saldo = (int)(saldo *ränta);
        
}
    public int getsaldo(){
        return saldo; 
    }


    public static void main(String[] args) {
        konto k1 = new konto(100000, 1); 
        k1.årsRänta(); 
        System.out.println(k1.getsaldo());
    }

}
