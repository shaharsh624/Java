import javax.swing.*;
import java.awt.*;

public class FifteenGraphics extends JPanel {
    FifteenGraphics() {
        JFrame app = new JFrame("Shapes in Graphics in Java");
        app.add(this);
        app.setSize(400,400);
        app.setLocationRelativeTo(null);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawString("Welcome",50, 50);
        g.drawLine(20,30,20,300);
        g.drawRect(70,100,30,30);
        g.fillRect(170,100,30,30);
        g.drawOval(70,200,30,30);

        g.setColor(Color.pink);
        g.fillOval(170,200,30,30);
        g.drawArc(90,150,30,30,30,270);
        g.fillArc(270,150,30,30,0,180);
    }

    public static void main(String[] args) {
        new FifteenGraphics();
    }
}  