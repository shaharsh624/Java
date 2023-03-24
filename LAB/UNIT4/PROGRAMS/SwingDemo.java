// Directly specifying in main class
/*
import javax.swing.*;

public class SwingDemo{

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Stops the execution after closing the component
        jf.setSize(400,500);

        jf.setLayout(null);

        JButton jb = new JButton("Hello"); // Add Button
        jb.setBounds(150,100,100,40); //Top, Left, Width, Height
        jf.add(jb);

        jf.setVisible(true);
    }
}
*/


// Using Constructor
/*
import javax.swing.*;

public class SwingDemo{
    JFrame jf ;
    // Constructor
    public SwingDemo() {
        jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Stops the execution after closing the component
        jf.setSize(400,500);

        jf.setLayout(null);

        JButton jb = new JButton("Hello"); // Add Button
        jb.setBounds(150,100,100,40); //Top, Left, Width, Height
        jf.add(jb);

        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingDemo sd = new SwingDemo();
    }
}
*/


// By Extending JFrame Class
/*
import javax.swing.*;

public class SwingDemo extends JFrame{
    // Constructor
    public SwingDemo() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Stops the execution after closing the component
        setSize(400,500);
        setLayout(null);

        // Add Button
        JButton jb = new JButton("Welcome");
        jb.setBounds(150,100,100,40); //Top, Left, Width, Height
        add(jb);
        String s = jb.getText();
        System.out.println(s);

        // Text Box
        JTextField t1 = new JTextField("Text ");
        t1.setBounds(200,120,100,70);
        add(t1);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingDemo sd = new SwingDemo();
        
    }
}
*/

import java.awt.event.*;
import javax.swing.*;

class swingDemo extends JFrame implements ActionListener {
    JButton jb;
    JTextField jt;

    swingDemo() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(320,95);
        setLayout(null);

        jb = new JButton("Click Here");
        jb.setBounds(5,5,200,50);
        add(jb);
        jt = new JTextField("Text ");
        jb.addActionListener(this);

        setVisible(true);


    }
    public void actionListener(ActionEvent e){
        jt.setText("Button Clicked");
    }

    public static void main(String[] args) {
        swingDemo ds = new swingDemo();
    }

    public void actionPerformed(ActionEvent e) {

    }
}