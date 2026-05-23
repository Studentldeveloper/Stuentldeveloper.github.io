import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class calculator { 
     static int count = 0; 
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton plusKnapp = new JButton("+");
        JLabel label = new JLabel("0"); 
        JButton minusKnapp = new JButton("-");
        

        plusKnapp.addActionListener(e->{
            count++; 
            label.setText("" + count);
        });  
        
        minusKnapp.addActionListener(e->{
            count--;
            label.setText("" + count);
        }); 
        frame.add(label);
        frame.add(plusKnapp);
        frame.add(minusKnapp);
        frame.setLayout(new java.awt.FlowLayout());
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
