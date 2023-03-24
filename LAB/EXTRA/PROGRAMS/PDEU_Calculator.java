package src;

import java.util.Scanner;
import java.lang.Math;
public class PDEU_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("(+) Addition\n(-) Subtraction\n(*) Multiplication\n(/) Division\n(%) Remainder\n(^) Square\n(s) Square root");
        System.out.print("\nEnter your Choice: ");
        String n = sc.nextLine();
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (n=="+"){
            System.out.println("Addition: "+ Math.addExact(a,b));
        }
        else if (n=="-"){
            System.out.println("Subtraction: "+ Math.subtractExact(a,b));
        }
        else if (n=="*"){
            System.out.println("Multiplication: "+ Math.multiplyExact(a,b));
        }
        else if (n=="/"){
            System.out.println("Division: "+ Math.floorDiv(a,b));
        }
        else if (n=="%"){
            System.out.println("Modulus: "+ (a%b));
        }
        else if (n=="s"){
            System.out.println("Square root: "+ (Math.sqrt(a)));
        }
        else if (n=="^"){
            System.out.println("Square root: "+ (Math.pow(a,2)));
        }
        sc.close();
    }
}
