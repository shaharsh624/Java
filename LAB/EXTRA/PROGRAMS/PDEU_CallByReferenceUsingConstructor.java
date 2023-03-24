/*
package src;// Call By Reference using constructor
import java.util.Scanner;

class Test{
    int a, b;
    void swap(Test t){
        int c = a;
        a = b;
        b = c;
    }
    Test(){
        System.out.println("1st Constructor invoked");
    }
}

class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Test t = new Test();
        Test t1 = t;
        t.a = sc.nextInt();
        t.b = sc.nextInt();
        // t.a = 5;
        // t.b = 6;
        System.out.println(t.a+", "+t.b);
        t.swap(t);
        System.out.println(t.a+", "+t.b);
    }
}
*/