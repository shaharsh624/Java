package PRACTICE.GUI;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame{
    JLabel label;
    JFrame frame;
    JButton b1,b2,b3;


    public GUI() {
        frame = new JFrame("Click Box");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);
        frame.setVisible(true);

        label = new JLabel("Counts");

        b1 = new JButton("Click here");

        JPanel panel = new JPanel(new GridLayout(0,1));
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.add(b1, BorderLayout.CENTER);
        panel.add(label, BorderLayout.CENTER);

        frame.add(panel);



    }






    public static void main(String[] args) {
        new GUI();
    }
}
