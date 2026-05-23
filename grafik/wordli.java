package grafik;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.Label;
public class wordli extends JFrame {
    JButton b1 = new JButton("gissa"); 
    JLabel textbox= new JLabel("skriv ett ord");
    JTextField input = new JTextField(10);

    public wordli(){
        this.setVisible(true);
        this.setSize(500,400);
        this.setLayout(new FlowLayout());
        String dum = new String();  
        String ord = input.getText();
        System.out.println(ord);
        this.add(input);
        this.add(b1);
        this.add(textbox); 
        b1.addActionListener(e->{
            if(ord==dum){
                System.out.println("bra jobbat");
            }else{
                System.out.println("tyvärr fel");
            }
        });


    }
public static void main(String[] args) {
    new wordli();
}
 
}
