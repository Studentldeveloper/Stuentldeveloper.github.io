import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;
public class snakeBoll extends JComponent{
    public snakeBoll(){ 
        setPreferredSize(new Dimension(400,400));
        
    }
    protected void paintComponent(Graphics g){
        super.paintComponent(g); 

        g.setColor(Color.red);
        g.fillOval(150, 90, 20, 20); 
        g.setColor(Color.blue); 
        g.fillRect(220, 70, 20, 100);
        g.setColor(Color.blue);
        g.fillRect(200, 70, 20, 20);
        g.setColor(Color.blue);
        g.fillRect(240, 150, 40, 20);
    } 
    public static void main(String[] args) {
        JFrame f = new JFrame("snakeBoll");
        f.setVisible(true); 
        f.setLayout(new FlowLayout());
        f.add(new snakeBoll()); 
        f.pack();
    }

}
