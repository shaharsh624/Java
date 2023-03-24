// Creating JFrame by Constructor

package PRACTICE.Swing;
import javax.swing.*;
public class SwingDemo2 {
    SwingDemo2(){
        JFrame jf = new JFrame("SwingDemo1");
        JButton jb = new JButton("Click");

        jb.setBounds(130,100,100,40);
        jf.add(jb);

        jf.setSize(400,500);
        jf.setLayout(null);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new SwingDemo2();
    }
}
