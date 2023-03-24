package PRACTICE.GUI;

import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo {
    JFrame frame;
    JPanel panel;


    public GridLayoutDemo() {
        frame = new JFrame();
        frame.setTitle("Hello World");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,500);
        frame.setLocationRelativeTo(null);

        panel = new JPanel(new GridLayout(0,5,10,10));
        // When no. of rows are declared 0, it is automatically taken and same for columns
        panel.setBackground(Color.RED);

        for (int i=1 ; i<=24 ; i++){
            JButton button = new JButton("Button" + i);
            panel.add(button);
        }
        frame.add(panel);
        frame.pack(); // gives preferred size to the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutDemo();
    }
}
