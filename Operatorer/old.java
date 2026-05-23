package Operatorer; 
import javax.swing.JOptionPane;

public class old { 
    public static void main(String[] args) {
        String stal=JOptionPane.showInputDialog("ange din ålder"); 
        int ålder = Integer.parseInt(stal); 
        int i = ålder; 
        double k = 10.0; 
        
        double kvot = ((int) (i/k))*10 + 10;
         stal = JOptionPane.showMessageDialog("du fyller " + kvot + " om " + kvot - i);


        
        JOptionPane.showMessageDialog(null, "svar" + kvot);





    }

}
