import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class nameRadiobuttons {
public static void main(String[] args) {
    JFrame frame = new JFrame(); 
    JTextField namn = new JTextField(10);
    JTextField epost = new  JTextField(10);

    JRadioButton fotboll = new JRadioButton("Fotboll");
    JRadioButton bandy = new JRadioButton("Bandy");
    JRadioButton Tennis = new JRadioButton("Tennis");

    ButtonGroup grupp = new ButtonGroup();
    grupp.add(fotboll);
    grupp.add(bandy); 
    grupp.add(Tennis); 

    JButton knapp = new JButton("visa"); 
    JLabel resultat = new JLabel();

    knapp.addActionListener(e->{
        String intresse = "";
        if(fotboll.isSelected()) intresse = "Fotboll";
        if(bandy.isSelected()) intresse = "Bandy";
        if(Tennis.isSelected()) intresse = "Tennis"; 

        resultat.setText(namn.getText() + "-" + epost.getText() + "-->" + intresse);
    }); 

    frame.add(namn); 
    frame.add(epost);
    frame.add(fotboll);
    frame.add(bandy);
    frame.add(Tennis);
    frame.add(knapp);
    frame.add(resultat);
    frame.setLayout(new java.awt.FlowLayout());
    frame.setSize(300,200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
}
}
