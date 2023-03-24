package src;// Call By Reference using constructor
import java.util.Scanner;

class Test2{
    int a, b;
    void swap(Test2 t){
        int c = a;
        a = b;
        b = c;
    }
    Test2(){
        System.out.println("1st Constructor invoked");
    }
}

class PDEU_CallByRefUsingConst {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Test2 t = new Test2();
        Test2 t1 = t;
        t.a = sc.nextInt();
        t.b = sc.nextInt();
        // t.a = 5;
        // t.b = 6;
        System.out.println(t.a+", "+t.b);
        t.swap(t);
        System.out.println(t.a+", "+t.b);
    }
}