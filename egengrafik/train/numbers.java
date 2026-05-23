package train;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class numbers {
 public static void main(String[] args) {
JFrame frame = new JFrame();
 JTextField tal1 = new JTextField(5);
 JTextField tal2 = new JTextField(5);
 JButton knapp = new JButton("Multiplicera");
 JLabel resultat = new JLabel();

 knapp.addActionListener(e->{
     
    int a  = Integer.parseInt(tal1.getText());
    int b = Integer.parseInt(tal2.getText()); 
    resultat.setText("resultat" + " " + (a*b));
 }); 

 frame.add(knapp);
 frame.add(resultat);
 frame.add(tal1);
 frame.add(tal2);
 frame.setLayout(new java.awt.FlowLayout());
 frame.setSize(200,300);
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setVisible(true);

 }


}
