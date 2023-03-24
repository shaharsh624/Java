package src;//Comparison Operators
import java.util.Scanner;
public class PDEU_ComparisonCalculator {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int b = sc.nextInt();

        boolean x1 = a>b;
        boolean x2 = a<b;
        boolean x3 = a>=b;
        boolean x4 = a<=b;
        boolean x5 = a!=b;
        boolean x6 = a==b;

		System.out.println("a>b : "+ x1);
		System.out.println("a<b : "+ x2);
		System.out.println("a>=b : "+ x3);
		System.out.println("a<=b : "+ x4);
		System.out.println("a!=b : "+ x5);
		System.out.println("a==b : "+ x6);
    sc.close();
    }
}
