package package1;

public class accessModifiers {
    public static void printData() {
        System.out.println("This is public access specifier");
    }

    protected static void print() {
        System.out.println("This is protected access specifier");
    }
    public static int a = 4;
    protected static int b = 3;
    int c = 2;  
}

class A extends accessModifiers {
    void printdata() {
        System.out.println(c);
    }
}