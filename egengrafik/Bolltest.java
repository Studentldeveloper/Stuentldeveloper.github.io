import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.*;
public class Bolltest extends JComponent{
    Boll b1 = new Boll(); 
    Boll b2= new Boll();

    
    private Timer t;
 
    public Bolltest(){
        setPreferredSize(new Dimension(500,500));

        t=new Timer(30, e->{

            update();
            
            repaint();

        }); 
        t.start(); 
        
        
    } 
    public void update(){ 
        b1.update();
        b2.update();

        }
    

    @Override
    protected void paintComponent(Graphics g) {
       
        super.paintComponent(g); 
        g.setColor(Color.MAGENTA);
        g.fillOval(b1.getX(), b1.getY(), 50, 50);  
        g.setColor(Color.ORANGE);
        g.fillOval(b2.getS(), b2.getC(), 50, 50);
    }
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setVisible(true);
        f.add(new Bolltest());
        f.pack();
    }
}
