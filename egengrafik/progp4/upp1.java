package progp4;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class upp1 { 
    public static void main(String[] args) {
        JFrame f = new JFrame(); 
        JButton uppsala = new JButton("Uppsala");
        JButton goteborg = new JButton("Göteborg");
        JButton malmo = new JButton("Malmö"); 
        JLabel resultat = new JLabel("resultat"); 

        uppsala.addActionListener(e->{
            resultat.setText("resan kostar 400kr");
        }); 
        goteborg.addActionListener(e->{
            resultat.setText("resan kostar 50kr");
        }); 
        malmo.addActionListener(e->{
            resultat.setText("resan kostar 500kr");
        }); 

        f.add(uppsala);
        f.add(goteborg);
        f.add(malmo);
        f.add(resultat);
        f.setSize(300,300);
        f.setVisible(true);
        f.setLayout(new java.awt.FlowLayout());

    }


}
