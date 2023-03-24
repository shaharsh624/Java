import javax.swing.*;
import java.awt.*;

public class TenGridLayout extends JFrame {
    TenGridLayout() {
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 2));
        FlowLayout layout = new FlowLayout();
        JPanel p2 = new JPanel();
        p2.setLayout(layout);
        JLabel one, two, three, four;
        JTextField tname, tsalary, tcode, tdesig;
        JButton buttonSave, buttonExit;

        one = new JLabel("NAME");
        tname = new JTextField(20);
        two = new JLabel("CODE");
        tcode = new JTextField(20);
        three = new JLabel("DESIGNATION");
        tdesig = new JTextField(20);
        four = new JLabel("SALARY");
        tsalary = new JTextField(20);
        buttonSave = new JButton("SAVE");
        buttonExit = new JButton("EXIT");

        p1.add(one);
        p1.add(tname);
        p1.add(two);
        p1.add(tcode);
        p1.add(three);
        p1.add(tdesig);
        p1.add(four);
        p1.add(tsalary);
        p2.add(buttonSave);
        p2.add(buttonExit);
        add(p1, "North");
        add(p2, "South");

        setVisible(true);
        this.setSize(400, 180);
    }

    public static void main(String args[]) {
        new TenGridLayout();
    }
}
