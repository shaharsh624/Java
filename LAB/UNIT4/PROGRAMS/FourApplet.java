import java.awt.Frame;
public class FourApplet extends Frame{
    FourApplet(String title){
        super();
        this.setTitle(title);
        this.setVisible(true);
    }

    public static void main(String args[]){
        FourApplet window = new FourApplet("Create Window Example");
    }
}
