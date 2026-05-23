package train;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class polygon { 
    public static void main(String[] args) {
        JFrame f = new JFrame();
         
        MyPanel panel = new MyPanel();
        f.add(panel);
        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }



class Mypanel extends JPanel{
    @Override 
    protected void paintComponent(Graphics g){
        int []x= {50,150,250}; 
        int []y= {200,50,200};
        Polygon nu = new Polygon(x,y,3);
        g.setColor(Color.green);
        g.fillPolygon(nu);
    }
}    
}
