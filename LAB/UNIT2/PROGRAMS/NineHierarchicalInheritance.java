// Hierarchical Inheritance
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

class C extends B {
    public void print_C() {
        System.out.println("Class C");
    }
}

class D extends A {
    public void print_D() {
        System.out.println("Class D");
    }
}

class E extends D{
    public void print_E() {
        System.out.println("Class E");
    }
}

public class NineHierarchicalInheritance {
    public static void main(String[] args) {
        System.out.println("-- Hierarchical Inheritance --");
        
        System.out.println("\nObject of Class A invoked");
        A obj_A = new A();
        obj_A.print_A();
        
        System.out.println("\nObject of Class B invoked");
        B obj_B = new B();
        obj_B.print_A();
        obj_B.print_B();

        System.out.println("\nObject of Class C invoked");
        C obj_C = new C();
        obj_C.print_A();
        obj_C.print_B();
        obj_C.print_C();

        System.out.println("\nObject of Class D invoked");
        D obj_D = new D();
        obj_D.print_A();
        obj_D.print_D();

        System.out.println("\nObject of Class E invoked");
        E obj_E = new E();
        obj_E.print_A();
        obj_E.print_D();
        obj_E.print_E();
    }
}