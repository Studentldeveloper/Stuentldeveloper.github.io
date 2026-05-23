import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class imagekarusell {
    private JFrame frame;
    private JLabel imageLabel;
    private JButton nextButton;

    private String[] images = {
        "egengrafikliggande.jpg",
        "egengrafik/pasten.jpg",
        "egengrafik/gopro.jpg"
    };

    private int currentIndex = 0; 

    public imagekarusell(){
        frame = new JFrame("imagekarusell");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        imageLabel = new JLabel();
        imageLabel.setBounds(50,50 , 300, 200);
        updateImage(); 

        nextButton = new JButton("Nästa bild");
        nextButton.setBounds(120, 270, 150, 30);

        nextButton.addActionListener(new ActionListener() {
            @Override 
            public void actionPerformed(ActionEvent e){
                currentIndex++; 

                if(currentIndex >= images.length){
                    currentIndex = 0;
                } 
                updateImage(); 
            }
        }); 

        frame.add(imageLabel);
        frame.add(nextButton);
        frame.setVisible(true); 
    } 

    private void updateImage(){
        ImageIcon icon = new ImageIcon(images[currentIndex]);
        imageLabel.setIcon(icon);
    } 
    public static void main(String[] args) {
        new imagekarusell();
    }
}
