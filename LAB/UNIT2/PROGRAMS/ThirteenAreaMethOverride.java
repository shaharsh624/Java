abstract class Shape {
    abstract void area();
}

class Triangle{
    void area(float b, float h) {
        System.out.println("Area of Triangle: " + (0.5f*b*h));
    }
}

class Rectangle{
    void area(int l, int b) {
        System.out.println("Area of Rectangle: "+(l*b));
    }
}

class Circle{
    void area(float r) {
        System.out.println("Area of Circle: " + ((float)(3.14*r*r)));
    }
}

public class ThirteenAreaMethOverride {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        Rectangle r = new Rectangle();
        Circle c = new Circle();
        t.area(3.3f,5.6f);
        r.area(3,6);
        c.area(3);
     }
}