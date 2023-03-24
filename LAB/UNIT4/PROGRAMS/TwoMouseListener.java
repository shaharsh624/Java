import java.awt.*;
import java.awt.event.*;
public class TwoMouseListener extends Frame implements MouseListener{
    Label l;
    TwoMouseListener(){
        addMouseListener(this);
        l=new Label();
        l.setBounds(20,50,300,300);
        add(l);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new TwoMouseListener();
    }
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked at " + e.getX() + " " + e.getY());
        System.out.println(getAlignmentX() + " " + getAlignmentY());
    }
    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed at " + getX() + " " + getY());
        System.out.println(getAlignmentX() + " " + getAlignmentY());
    }
    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }
    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }
    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
    }
}