package train;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Polygon;
public class traingelprogram { 
public static void main(String[] args) {
    JFrame frame = new JFrame();

    MyPanel panel = new MyPanel(); // <-- rätt!
    frame.add(panel);
    frame.setSize(300,300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
}

} 

class MyPanel extends JPanel{
    @Override 
    protected void paintComponent(Graphics g){
        int[]x= {50,150,250};
        int[]y= {200,50,200};

        Polygon nu = new Polygon(x,y,3);
        g.setColor(Color.BLUE);
        g.fillPolygon(nu);
    }
}
