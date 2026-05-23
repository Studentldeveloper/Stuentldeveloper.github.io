package train;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class convert { 
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton knapp = new JButton();
        JLabel label = new JLabel("hello world"); 

        knapp.addActionListener(e->{
            label.setText("Hej");
        }); 
        frame.add(knapp);
        frame.add(label);
        frame.setVisible(true);
        frame.setSize(200,300); 
        frame.setLayout(new java.awt.FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

}
