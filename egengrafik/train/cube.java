package train;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class cube extends JComponent{ 
    public cube(){
        setPreferredSize(new Dimension(400,400));
    } 
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(Color.red);   
        g.fillRect(220, 70, 50, 50); 
        g.setColor(Color.blue);
        g.fillOval(150, 30, 20, 20);

    } 
    public static void main(String[] args) {
        JFrame frame = new JFrame(); 
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());
        frame.add(new cube());
        frame.pack();
    }

}
