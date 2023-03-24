package PRACTICE.GUI;

import javax.swing.*;
import java.awt.*;

public class JPanelDemo{

    JFrame frame;
    JPanel panel;

    public JPanelDemo(){
        frame = new JFrame();
        frame.setLayout(new BorderLayout(10,5));
        frame.setTitle("JPanel Demo");
        frame.setSize(800,500);
        frame.setLocationRelativeTo(null); // Sets location as center of screen
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20)); // For All components of JPanel
        panel.setBackground(Color.RED);
        frame.add(panel, BorderLayout.CENTER);

        JButton button1 = new JButton("Button");
        Button button2 = new Button("Button");
        panel.add(button1);
        panel.add(button2);





    }


    public static void main(String[] args) {
        new JPanelDemo();
    }
}
