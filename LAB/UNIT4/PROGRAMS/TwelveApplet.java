import java.applet.Applet;
import java.awt.Graphics;
public class TwelveApplet extends Applet {
    public void init() {
        System.out.println("In init()");
    }
    public void start() {
        System.out.println("In start()");
    }
    public void paint(Graphics g) {
        System.out.println("In paint()");
    }
    public void stop() {
        System.out.println("In stop()");
    }
    public void destroy() {
        System.out.println("In destroy()");
    }
}

