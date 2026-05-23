import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class summera { 
    public static void main(String[] args) {
        JFrame frame = new JFrame("Summera");

        JTextField tal1 = new JTextField(5);
        JTextField tal2 = new JTextField(5);
        JButton knapp = new JButton("Summera");
        JLabel resultat = new JLabel("Svar");

        knapp.addActionListener(e->{
            int a = Integer.parseInt(tal1.getText());
            int b = Integer.parseInt(tal2.getText()); 

            int svar = plus(a,b); 

            resultat.setText("svar:" + svar);
        }); 
        frame.setLayout(new java.awt.FlowLayout());
        frame.add(tal1);
        frame.add(tal2);
        frame.add(knapp);
        frame.add(resultat); 

        frame.setSize(300,200); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    } 
    public static int plus(int tal1, int tal2){
        return tal1 + tal2;
    }

}
