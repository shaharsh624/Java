import java.awt.*;
import java.awt.event.*;
public class TwoMouseMotionListener extends Frame implements MouseMotionListener{
    Label l;
    TwoMouseMotionListener(){
        addMouseMotionListener(this);
        l=new Label();
        l.setBounds(20,50,100,20);
        add(l);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new TwoMouseMotionListener();
    }
    public void mouseDragged(MouseEvent e) {
        Graphics g=getGraphics();
        g.setColor(Color.RED);
        g.fillOval(e.getX(),e.getY(),20,20);
    }
    public void mouseMoved(MouseEvent e) {
        l.setText("mouse is moved to point " + e.getX() + " " + e.getY());
    }
}