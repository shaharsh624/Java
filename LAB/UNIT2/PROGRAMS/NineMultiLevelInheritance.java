// Multiple inheritance
class A {
    public void print_A() {
        System.out.println("Class A");
    }
}

class B extends A {
    public void print_B() { System.out.println("Class B"); }
}

class C extends B {
    public void print_C() {
        System.out.println("Class C");
    }
}

public class NineMultiLevelInheritance {
    public static void main(String[] args) {
        System.out.println("-- Multiple Inheritance --");
        C c = new C();
        c.print_A();
        c.print_B();
        c.print_C();
    }
}