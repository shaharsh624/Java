import java.awt.*;
import javax.swing.*;

class BoderLayoutDemo extends JFrame {
    BoderLayoutDemo() {
        JPanel pa = new JPanel();
        pa.setLayout(new BorderLayout());
        pa.add(new JButton("Welcome"), BorderLayout.NORTH);
        pa.add(new JButton("OOP"), BorderLayout.SOUTH);
        pa.add(new JButton("Layout"), BorderLayout.EAST);
        pa.add(new JButton("Border"), BorderLayout.WEST);
        pa.add(new JButton("Java"), BorderLayout.CENTER);
        add(pa);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setVisible(true);
    }
}

class NineBorderLayout {

    // Driver code
    public static void main(String[] args) {
        new BoderLayoutDemo();
    }
}
