package train;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class rektangel extends JPanel{  
    @Override 
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillRect(40, 40, 30, 30);
    } 
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.add(new rektangel());
        f.setSize(300,300);
        f.setVisible(true);
    }


}
