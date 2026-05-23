package objecktcrientering;

public class bil { 
    private int wheel;                        //instansvariabler 
    private int seat;                         // instans metod kräver ett objekt för att fungera; static metod kräver inte något för att fungera
    private int växel; 
    private String märke;  

    static String serverip;                 //klassvariabel  medlemsvariabler 
    public bil(){

        this.wheel= 4; 
        this.seat= 5; 
        this.växel = 0; 
        this.märke = "Volvo";  
    }
    public bil(String m){  // något som ser ut som en klass och har samma namn kallas för konstruktur

        serverip = "192";

        wheel = 4; 
        seat = 5; 
        växel =0; 
        märke = m; 

    }
    public  int getVäxel(){ 
        return this.växel;

    }

    public static void main(String[] args) { 
        

        bil b1=new bil(); 
        bil b2 = new bil(); 
        System.out.println(b2.växel);
           
        int vv =b1.getVäxel(); 
        System.out.println(vv);
        
    }

    }

    
    



