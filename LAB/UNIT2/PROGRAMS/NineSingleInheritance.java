class A {
    public void print_A() {
        System.out.println("Class A");
    }
}

class B extends A {
    public void print_B() {
        System.out.println("Class B");
    }
}

public class NineSingleInheritance {
    public static void main(String[] args) {
        System.out.println("-- Single Inheritance --");
        B b = new B();
        b.print_A();
        b.print_B();
    }
}