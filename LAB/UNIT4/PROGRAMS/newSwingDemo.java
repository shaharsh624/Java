import java.awt.*;
import javax.swing.*;

class newSwingDemo extends JPanel {
    JButton jb;
    JTextField jt;

    newSwingDemo() {
        JFrame app = new JFrame("Smiley App");
        app.add(this);
        app.setSize(600,600);
        app.setLocationRelativeTo(null);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setBackground(Color.decode("#ff0000"));
        g.setColor(Color.YELLOW);
        g.fillOval(10,10,100,100);
        g.setColor(Color.GREEN);
        g.fillOval(80,10,100,100);

        g.setColor(Color.BLACK);

        g.drawArc(40,60,30,30,0,180);
        g.drawString("Hello!", 200,200);
    }

    public static void main(String[] args) {
        new FourteenPaint();
    }
}
