
class Point1{
    int x,y,z;
    Point1(){
        x=0;
        y=0;
        z=0;
        System.out.println("Invoked Default constructor");
        System.out.println(x + ", " + y + ", " + z);
    }

    Point1(int ix, int iy, int iz){
        x = ix;
        y = iy;
        z = iz;
        System.out.println("Invoked Parameterized constructor");
        System.out.println(x + ", " + y + ", " + z);
    }
    Point1(Point1 p){
        x = p.x;
        y = p.y;
        z = p.z;
        System.out.println("Invoked Copy Constructor");
        System.out.println(x + ", " + y + ", " + z);
    }
}

public class FourConstructor {
    public static void main(String[] args) {
        Point1 p1 = new Point1();
        Point1 p2 = new Point1(5,10,15);
        Point1 p3 = new Point1(p2);
    }
}