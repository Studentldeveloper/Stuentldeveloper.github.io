package train;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class intresse { 
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel intresse = new JLabel("välj ett intresse");
        JRadioButton fotboll = new JRadioButton("Fotboll"); 
        JRadioButton innebandy = new JRadioButton("Innebandy");
        JRadioButton tennis = new JRadioButton("Tennis");

        ButtonGroup group = new ButtonGroup();
        group.add(fotboll);
        group.add(innebandy);
        group.add(tennis); 

        JButton knapp = new JButton("visa"); 
        JLabel resultat = new JLabel();

        knapp.addActionListener(e->{
            String Intresse = ""; 
            if(fotboll.isSelected()) Intresse = "Fotboll";
            if(innebandy.isSelected()) Intresse = "Innebandy";
            if(tennis.isSelected()) Intresse = "Tennis";
            resultat.setText(Intresse); 


        }); 

        frame.add(intresse);
        frame.add(fotboll);
        frame.add(innebandy);
        frame.add(tennis);
        frame.add(knapp);
        frame.add(resultat);
        frame.setLayout(new java.awt.FlowLayout());
        frame.setSize(200,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    } 

}
