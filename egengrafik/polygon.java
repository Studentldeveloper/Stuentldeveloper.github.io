import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class polygon extends JPanel{ 
    protected void paintComponent(Graphics g){
        super.paintComponent(g); 
        int[] x= {100,50,150};
        int[] y= {50,100,150};
        g.fillPolygon(x,y,3);
    }

    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new polygon());
        frame.setSize(300,300);
        frame.setVisible(true);
        
    }

}
