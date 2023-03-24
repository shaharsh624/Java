package src;
import java.lang.*;
class abc {
    public void print_abc()
    {
        System.out.println("abc");
    }
}
class and extends abc {
    public void print_and() { System.out.println("and"); }
}
class xyz extends and {
    public void print_xyz()
    {
        System.out.println("xyz");
    }
}
public class multiLevelInheritance {
    public static void main(String[] args)
    {
        xyz g = new xyz();
        g.print_abc();
        g.print_and();
        g.print_xyz();
    }
}