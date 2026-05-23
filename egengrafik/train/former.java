package train;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class former extends JPanel{ 
    @Override 
    protected void paintComponent(Graphics g){
        super.paintComponent(g);  

        g.setColor(Color.red);
        g.fillRect(130, 50, 50, 50); 
        g.setColor(Color.green);
        g.fillOval(70, 50, 50, 50);
    }  

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.add(new former());
        f.setSize(300,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }
 

}
