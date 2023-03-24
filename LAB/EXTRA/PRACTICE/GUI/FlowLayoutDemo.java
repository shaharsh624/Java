package PRACTICE.GUI;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo {
    JFrame frame;
    JPanel panel;


    public FlowLayoutDemo() {
        frame = new JFrame();
        frame.setTitle("Hello World");

        panel = new JPanel(new FlowLayout(FlowLayout.LEFT,10,5));
        panel.setBackground(Color.pink);

        for (int i=1 ; i<=5 ; i++){
            JButton button = new JButton("Button" + i);
            panel.add(button);
        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,500);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null); // Sets location as center of screen
        frame.setVisible(true);
        frame.add(panel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new FlowLayoutDemo();
    }
}
