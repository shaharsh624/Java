package src;//Logical Operators
import java.util.Scanner;
public class PDEU_logicalCalculator {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
				
		System.out.println("(a>b) && (c>b) : "+ ((a>b) && (c>b)));
		System.out.println("(a>b) || (c>b) : "+ ((a>b) || (c>b)));
		System.out.println("!(a>b) : "+ !(a>b));
		sc.close();
    }
}
