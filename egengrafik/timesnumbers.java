import javax.swing.*;
import java.awt.event.*;

public class timesnumbers { 
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JTextField tal1 = new JTextField(5);
        JTextField tal2 = new JTextField(5);
        JButton knapp = new JButton("Multiplicera");
        JLabel svar = new JLabel();

        knapp.addActionListener(e->{
            int a = Integer.parseInt(tal1.getText());
            int b = Integer.parseInt(tal2.getText());
            svar.setText("svar:" + (a*b));
        });  
        frame.setLayout(new java.awt.FlowLayout());
        frame.add(knapp);
        frame.add(svar);
        frame.add(tal1); 
        frame.add(tal2);

        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
