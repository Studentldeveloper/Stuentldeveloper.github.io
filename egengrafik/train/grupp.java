package train;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class grupp { 
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
            String ok = "";
            if(fotboll.isSelected()) ok = "Fotboll";
            if(innebandy.isSelected()) ok = "Innebandy";
            if(tennis.isSelected()) ok = "Tennis";
            resultat.setText(" du har valt" +" "+ ok);
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
