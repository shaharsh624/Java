import java.awt.*;
import javax.swing.*;

class Layout extends JFrame {
    JLabel l1, l2, l3, l4, l5;
    public Layout() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout layout = new FlowLayout();
        this.setLayout(layout);
        l1 = new JLabel("Label 1 ");
        l2 = new JLabel("Label 2 ");
        l3 = new JLabel("Label 3 ");
        l4 = new JLabel("Label 4 ");
        l5 = new JLabel("Label 5 ");
        this.add(l1);
        this.add(l2);
        this.add(l3);
        this.add(l4);
        this.add(l5);
    }
}

class NineFlowLayout {
    public static void main(String[] args) {
        Layout f = new Layout();
        f.setTitle("Example of FlowLayout");
        f.setBounds(200, 100, 600, 400);
        f.setVisible(true);
    }
}
