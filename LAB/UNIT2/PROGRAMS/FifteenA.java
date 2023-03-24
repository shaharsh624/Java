class A {
    void show() {
        System.out.println("Inside Class-A");
    }
}
class B extends A {
    void show() {
        System.out.println("Inside Class-B");
    }
}
public class FifteenA {
    public static void main(String arg[]) {
        B obj=new B();
        obj.show(); //show() method of class-B will called.
    }
}