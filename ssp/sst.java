package ssp;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class sst extends JFrame implements ActionListener {  
    //skapar knappar för användaren och datorn
    JButton sten= new JButton("sten"); 
    JLabel textbox = new JLabel();
    JButton sax= new JButton("sax");
    JButton pose= new JButton("påse"); 
    JButton stend = new JButton("sten");
    JButton saxd = new JButton("saxD");
    JButton poseD = new JButton("påse");

    public sst(){
        //sten
        this.setVisible(true);
        this.setSize(500,400);
        this.setLayout(new FlowLayout());
        this.add(sten);
        this.add(textbox);
        sten.addActionListener(this);
           
        
        //sax
        this.setVisible(true);
        this.setSize(500,400);
        this.setLayout(new FlowLayout());
        this.add(sax);
        this.add(textbox);
        sax.addActionListener(this); 

        //pose
        this.setVisible(true);
        this.setSize(500,400);
        this.setLayout(new FlowLayout());
        this.add(pose);
        this.add(textbox);
        pose.addActionListener(this); 
        //Dator sten 
        this.setVisible(true);
        this.setSize(500,400);
        this.setLayout(new FlowLayout());
        this.add(stend);
        this.add(textbox); 
        
        
         //Dator sax 
        this.setVisible(true);
        this.setSize(500,400);
        this.setLayout(new FlowLayout());
        this.add(saxd);
        this.add(textbox);
         
        //Dator pose 
        this.setVisible(true);
        this.setSize(500,400);
        this.setLayout(new FlowLayout());
        this.add(poseD);
        this.add(textbox);
        
        }
    public static void main(String[] args) {
        new sst();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
            //låter datorn slumpa ett tal
            int slumpTal = (int)(Math.random()*3) +1; 
            System.out.println(slumpTal);

            if(e.getSource()==sten && slumpTal==1 || e.getSource()==sax && slumpTal==2 || e.getSource()==pose && slumpTal == 3){

                System.out.println("Oavgjort");

            }else if(e.getSource()==sten && slumpTal== 3 || e.getSource()==sax && slumpTal==1 || e.getSource()== pose && slumpTal ==2){
                System.out.println("Datorn vann");
            }else{
                System.out.println("Du vann");
            }
            
    }



    

}




