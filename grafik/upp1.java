package grafik;

import javax.swing.*;
 
import java.awt.FlowLayout;

public class upp1  extends JFrame{
 
JButton b1 = new JButton("+");
JLabel textbox = new JLabel("0"); 
JButton b2 = new JButton("-"); 
int i=0;

public upp1(){ 

    this.setVisible(true);
    this.setSize(500,400);
    this.setLayout(new FlowLayout()); 
    this.add(b1);
    this.add(textbox);  
    b1.addActionListener(e->{ 
        i++;
        textbox.setText(""+ i);
    }); 
    this.setVisible(true);
    this.setSize(500,400);
    this.setLayout(new FlowLayout());
    this.add(b2);
    this.add(textbox);
    b2.addActionListener(e->{ 
        i--;
        textbox.setText(""+i);
    });
 

}  
public static void main(String[] args) {
    new upp1();
}



}
