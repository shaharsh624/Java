package PRACTICE.GUI;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo {
    private JFrame frame;

    public BorderLayoutDemo() {
        frame = new JFrame();
        frame.setTitle("Hello World");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,500);
        frame.setLayout(new BorderLayout(5,5));

        frame.add(new JButton("NORTH BUTTON"), BorderLayout.NORTH);
        frame.add(new JButton("SOUTH BUTTON"), BorderLayout.SOUTH);
        frame.add(new JButton("EAST BUTTON"), BorderLayout.EAST);
        frame.add(new JButton("WEST BUTTON"), BorderLayout.WEST);
        frame.add(new JButton("CENTER BUTTON"), BorderLayout.CENTER);


        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutDemo();
    }
}
