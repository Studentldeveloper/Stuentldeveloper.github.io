package train;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cirklar extends JComponent{   
    
    public cirklar(){
        setPreferredSize(new Dimension(400, 400));
    } 
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillOval(50, 70, 30, 30);
        g.setColor(Color.green);
        g.fillOval(150, 70, 30, 30);
        g.setColor(Color.black);
        g.fillOval(200, 70, 30, 30);

    } 
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setVisible(true);
        f.setLayout(new FlowLayout());
        f.add(new cirklar());
        f.pack();

    }

}
