import java.awt.event.*;
import javax.swing.*;


public class knapphej{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton knapp = new JButton("klicka");
        JLabel label = new JLabel("hello world");

        knapp.addActionListener(e-> label.setText("Hej")); 

        frame.setLayout(new java.awt.FlowLayout()); 

        frame.add(knapp);
        frame.add(label); 

        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); 
        knapp.addActionListener(e-> label.setForeground(java.awt.Color.RED));
    } 
}