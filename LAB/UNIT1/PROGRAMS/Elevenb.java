// Call By Reference
import java.util.Scanner;

class Test{
    int a, b;
    void swap(Test t){
        int c = a;
        a = b;
        b = c;
    }
}

public class Elevenb {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Test t = new Test();
        t.a = sc.nextInt();
        t.b = sc.nextInt();
        // t.a = 5;
        // t.b = 6;
        System.out.println("Values before: "+t.a+", "+t.b);
        t.swap(t);
        System.out.println("Values after: "+t.a+", "+t.b);
    }
}