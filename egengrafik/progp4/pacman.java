package progp4;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class pacman extends JComponent{ 
    @Override 
    protected void paintComponent(Graphics g){
        super.paintComponent(g); 

        g.setColor(Color.red);
        g.fillOval(148, 59, 44, 44);
        g.fillRect(151, 70, 40, 40);   
        g.setColor(Color.white);
        g.fillOval(155, 80, 10, 10); 
        g.fillOval(175, 80, 10, 10); 
        g.setColor(Color.blue);
        g.fillOval(160, 83, 5, 5); 
        g.fillOval(180, 83, 5, 5); 
        g.setColor(Color.yellow);
        g.fillOval(180, 104, 10, 10);
        g.fillOval(150, 104, 10, 10); 
        g.fillOval(165, 104, 10, 10);
        


    } 
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setSize(300,400); 
        f.add(new pacman());
    }

}
