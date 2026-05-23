package train;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class hus extends JPanel{ 
    @Override 
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        setBackground(Color.cyan);

        g.setColor(Color.orange);
        g.fillRect(100, 150, 150, 100);
        int[]x={100,175,250};
        int[]y={150,80,150};
        g.setColor(Color.red);
        g.fillPolygon(x,y,3);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(155, 190, 40, 60);

        g.setColor(Color.white);
        g.fillRect(120, 170, 30, 30);
        g.fillRect(200, 170, 30, 30); 

        

    } 
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.add(new hus());
        f.setSize(400,350);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

}
