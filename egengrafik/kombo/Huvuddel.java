package kombo;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Huvuddel {

JFrame f = new JFrame(); 
JButton b = new JButton("Flytta fyrkant"); 
Fyrkant fyr=new Fyrkant();

    public Huvuddel(){ 

        f.setVisible(true);
        f.setSize(800,800); 
        f.setLayout(new FlowLayout());
        f.add(b);
        f.add(fyr);
        b.addActionListener(e->{
            fyr.changeX();
        });


}


    public static void main(String[] args) {
        new Huvuddel(); 

    }
}
