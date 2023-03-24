import java.awt.*;
import javax.swing.*;

class FourteenPaint extends JPanel {
    JButton jb;
    JTextField jt;

    FourteenPaint() {
        JFrame app = new JFrame("Application");
        app.add(this);
        app.setSize(300,300);
        app.setLocationRelativeTo(null);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.YELLOW);
        g.fillOval(10,10,100,100);

    }

    public static void main(String[] args) {
        new FourteenPaint();
    }
}
