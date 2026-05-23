package grafik;

import java.awt.FlowLayout;


import javax.swing.*;

public class text { 
    JButton b1 = new JButton("send"); 
    JTextField t1 = new JTextField(10);
    
    JFrame w = new JFrame();


public text(String s){ 
    w.setVisible(true); 
    w.setLayout ( new FlowLayout());
    w.setSize (400,400); 
    w.add(t1); 
    w.add(b1); 
    b1.setText(s);
    b1.addActionListener(e->{
        String s1;  
        //System.out.println(s1); 
        this.newtext(); 
        String s2 = "Hej"; 
        if(s1==s2){
            System.out.print("du vann");
        }else{
            String s1 = t1.getText();
        }
    }); 
    
    

} 
public void newtext(){ 
    
w.setTitle("sida");

}
public static void main(String[] args) {
    text t1 = new text("hej");
    
}

}
