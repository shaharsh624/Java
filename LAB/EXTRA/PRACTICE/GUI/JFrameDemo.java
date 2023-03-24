package PRACTICE.GUI;

import javax.swing.*;

public class JFrameDemo {
    private JFrame frame;

    public JFrameDemo() {
        frame = new JFrame();
        frame.setTitle("Hello World");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null); // Sets location as center of screen
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new JFrameDemo();
    }
}
