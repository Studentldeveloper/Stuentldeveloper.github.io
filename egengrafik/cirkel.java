import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;


public class cirkel extends JComponent {

    public cirkel(){ 
        setPreferredSize(new Dimension(400,400));

    }
    protected void paintComponent(Graphics g){

        super.paintComponent(g);

        g.setColor(Color.BLUE);
        g.drawOval(150, 90, 60, 60);
        g.setColor(new Color(255,100, 100));
        g.fillOval(123, 70, 40, 40); 
        g.setColor(new Color(255,100,100)); 
        g.fillOval(193, 70, 40, 40);
        g.setColor(new Color(0,0,0)); 
        g.fillOval(155, 100, 10, 20);
        

    }

     public static void main(String[] args) { 
        JFrame f = new JFrame("cirkelprogram"); 
        f.setVisible(true);
        f.setLayout(new FlowLayout()); 
        f.add(new cirkel());
        f.pack();

        
     }



}