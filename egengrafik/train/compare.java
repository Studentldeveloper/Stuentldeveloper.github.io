package train;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import provmetoder.tal;

public class compare { 
    public static void main(String[] args) {
        JFrame frame = new  JFrame();
        JTextField tal1 = new JTextField(5);
        JTextField tal2 = new JTextField(5);
        JLabel label = new  JLabel();
        JButton compare = new JButton("Jämför");

        compare.addActionListener(e->{
            int a = Integer.parseInt(tal1.getText());
            int b = Integer.parseInt(tal2.getText());
            
            String resultat;
                if(a>b){
                    resultat = a + "är större än" + b;
                } 
                if(a<b){
                    resultat = b + " är större än " + a;
                }else{
                    resultat = "Talen är lika stora";
                } 
                label.setText(resultat);
           


        
        }); 
        frame.add(compare);
        frame.add(tal1);
        frame.add(tal2);
        frame.add(label);
        frame.setLayout(new java.awt.FlowLayout());
        frame.setSize(200,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }

}
