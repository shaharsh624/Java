package src;//Arithmetic Operators
import java.util.Scanner;
import java.lang.Math;
public class PDEU_ArithmeticCalculator {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("1- Addition\n2- Subtraction\n3- Multiplication\n4- Division\n5- Remainder");
		System.out.print("Enter your Choice: ");
		int n = sc.nextInt();
		
		if (n==1){
		    System.out.println("Addition: "+ (a+b));
		}
		else if (n==2){
		    	System.out.println("Subtraction: "+ (a-b));
		}
		else if (n==3){
		    	System.out.println("Multiplication: "+ (a*b));
		}
		else if (n==4){
		    	System.out.println("Division: "+ (a/b));
		}
		else if (n==5){
		    	System.out.println("Modulus: "+ (a%b));
		}
		else if (n==5){
		    	System.out.println("Square root: "+ (Math.sqrt(a)));
		}
		sc.close();
	}
}
