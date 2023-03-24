package src;// Call By Reference
import java.util.Scanner;

class Test1{
    int a, b;
    void swap(Test1 t){
        int c = a;
        a = b;
        b = c;
    }
}

public class PDEU_CallByReference {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Test1 t = new Test1();
        t.a = sc.nextInt();
        t.b = sc.nextInt();
        // t.a = 5;
        // t.b = 6;
        System.out.println(t.a+", "+t.b);
        t.swap(t);
        System.out.println(t.a+", "+t.b);
    }
}