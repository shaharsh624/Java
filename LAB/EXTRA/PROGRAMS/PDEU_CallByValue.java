package src;// Call by value
import java.util.Scanner;

class PDEU_CallByValue {
    static void swap(int a, int b){
        int c = a;
        a=b;
        b=c;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println(a+", "+b);
        swap(a,b);
        System.out.println(a+", "+b);
    }
}