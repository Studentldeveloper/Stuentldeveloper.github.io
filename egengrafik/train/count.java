package train;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class count { 
    static int count = 0;
    public static void main(String[] args) {
       
    JFrame f=new JFrame();
    JButton plus = new JButton("+");
    JButton minus = new JButton("-"); 
    JLabel label = new JLabel(); 
    JTextField tal1 = new JTextField(5);
    JTextField tal2 = new JTextField(5);
    

    plus.addActionListener(e->{
        int a = Integer.parseInt(tal1.getText());
        int b = Integer.parseInt(tal2.getText());

        label.setText("resultat" +" "+(a+b));
    }); 
    minus.addActionListener(e->{
        int a = Integer.parseInt(tal1.getText());
        int b = Integer.parseInt(tal2.getText());

        label.setText("resultat" + " " +(a-b));
    }); 

    f.add(plus);
    f.add(minus);
    f.add(label);
    f.setLayout(new java.awt.FlowLayout());
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true); 
    f.setSize(200, 300);
    f.add(tal1);
    f.add(tal2);

    } 

    



}
