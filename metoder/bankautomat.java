import java.util.Scanner;
public class bankautomat {    

    static int balance = balance();

    public static void main(String[] args) {   

        Scanner sc = new Scanner(System.in); 
        System.out.println("Ange hur mycket du ska sätt in: ");

        bankautomat.deposit(balance); 
         
        
        int b = bankautomat.balance(); 
        System.out.println(b); 
        bankautomat.withdraw(500);  
        System.out.println("kvar blir " + balance);
    }



    //insättning 
public static void deposit(int amount){  
     
    
    balance = balance + amount;

}
    



    //uttag 
public static void withdraw(int amount){ 
    
    balance = balance - amount;  
    






}


    //saldo 

    public static int balance(){
        return balance;
    }
 
}

