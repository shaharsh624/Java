package PRACTICE.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonDemo {
    JFrame frame;
    JPanel panel;
    JButton button;


    public JButtonDemo() {
        frame = new JFrame();
        frame.setTitle("Hello World");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,500);
        frame.setLocationRelativeTo(null);

        panel = new JPanel();
        button = createButton();
        panel.add(button);

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private JButton createButton() {
        JButton button = new JButton("Print");
        button.setFocusable(false); // removes the dotted box
//        ImageIcon printIcon = new ImageIcon("printer.png");
//        button.setIcon(printIcon);
        button.setToolTipText("Just Print It!!");
        button.setFont(new Font("Arial", Font.PLAIN, 20));
        button.setMargin(new Insets(10,10,10,10));
//        button.setEnabled(false);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Print button has been clicked");
            }
        });
//        button.doClick(); // By default clicks the button

        return button;
    }

    public static void main(String[] args) {
        new JButtonDemo();
    }
}
