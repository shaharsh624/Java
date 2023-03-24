import java.time.*;
public class ThirteenClock {
    public static void main(String[] args) {
        Clock c = Clock.systemDefaultZone();
        System.out.println(c.getZone());
        System.out.println(c.instant());
    }
}