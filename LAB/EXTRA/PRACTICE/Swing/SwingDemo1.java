// Creating JFrame and JButton

package PRACTICE.Swing;
import javax.swing.*;
public class SwingDemo1 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("SwingDemo1");
        JButton jb = new JButton("Click");

        jb.setBounds(130,100,100,40);
        jf.add(jb);

        jf.setSize(400,500);
        jf.setLayout(null);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }
}
