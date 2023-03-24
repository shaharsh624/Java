// Creating JFrame by inheritance

package PRACTICE.Swing;
import javax.swing.*;
public class SwingDemo3 extends JFrame{
    JFrame jf;
    SwingDemo3(){
        JButton jb = new JButton("Click");

        jb.setBounds(130,100,100,40);
        add(jb);

        setSize(400,500);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SwingDemo3();
    }
}
