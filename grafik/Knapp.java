package grafik;

import javax.swing.*;
 
import java.awt.FlowLayout;

public class Knapp  extends JFrame{
 
JButton b1 = new JButton("click me");
JLabel textbox = new JLabel();

public Knapp(){ 

    this.setVisible(true);
    this.setSize(500,400);
    this.setLayout(new FlowLayout()); 
    this.add(b1);
    this.add(textbox);  
    b1.addActionListener(e->{
        textbox.setText("hej bte24");
    });
 

}  
public static void main(String[] args) {
    new Knapp();
}



}
