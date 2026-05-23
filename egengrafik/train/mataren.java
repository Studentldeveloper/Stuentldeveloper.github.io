package train;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class mataren { 
    static int count = 0; 
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton Plusknapp = new JButton("+");
        JButton Minusknapp = new JButton("-");
        JLabel label = new JLabel("0"); 
         Plusknapp.addActionListener(e->{
            count++;
            label.setText("" + count); 

         });  
         Minusknapp.addActionListener(e->{
            count--;
            label.setText("" + count);
         }); 
         frame.add(Plusknapp); 
         frame.add(label);
         frame.add(Minusknapp);
         frame.setLayout(new java.awt.FlowLayout());
         frame.setSize(300,200);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);

    }

}
