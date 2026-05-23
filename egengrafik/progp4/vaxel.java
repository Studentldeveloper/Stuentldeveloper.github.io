package progp4;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class vaxel {  

    public static void main(String[] args) {
        JFrame f = new JFrame();
        JButton open = new JButton("växla");
        JLabel procent = new JLabel();
        open.addActionListener(e->{
            procent.setText("öppet 25%");
        }); 
         open.addActionListener(e->{
            procent.setText("öppet 50%");
        }); 
         open.addActionListener(e->{
            procent.setText("öppet 100%");
        });
         open.addActionListener(e->{
            procent.setText("stängd"); 
            

        });  
        

        f.add(open); 
        f.add(procent);
        f.setVisible(true);
        f.setSize(300,400);
        f.setLayout(new FlowLayout());

    }

}
