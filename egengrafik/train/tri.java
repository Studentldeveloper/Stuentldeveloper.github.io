package train;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class tri extends JPanel{ 
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g); 
        int[]x= {100,100,50,30};
        int[]y= {100,50,30,40}; 
        Polygon nu = new Polygon(x,y,3);
        g.setColor(Color.green);
        g.fillPolygon(nu);

    } 
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(300,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true); 
        f.add(new tri());

    }

}
