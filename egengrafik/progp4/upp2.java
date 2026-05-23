package progp4;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class upp2 { 
    public static void main(String[] args) {
        JFrame f = new JFrame();
        JTextField tal1 = new JTextField(5);
        JTextField tal2 = new JTextField(5);
        JLabel resultat = new JLabel();
        JButton multiplicera = new JButton("Multiplicera");
        
        
        multiplicera.addActionListener(e->{ 
            int a = Integer.parseInt(tal1.getText());
            int b = Integer.parseInt(tal2.getText()); 

            resultat.setText("resultat" +" "+ (a*b));
        });
        f.add(tal1);
        f.add(tal2);
        f.add(resultat);
        f.add(multiplicera);
        f.setLayout(new java.awt.FlowLayout());
        f.setVisible(true);
        f.setSize(300,300);

    }

}
