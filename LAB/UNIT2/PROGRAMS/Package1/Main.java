package Package1;
class A {
    protected static int a=1;
    public static int b=2;
    static int c=3;
    public static void printData() {
       System.out.println("This is Class A");
    }
}

class B extends A{
    static void print() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

public class Main{
    public static void main(String[] args) {
        B.printData();
    }
}