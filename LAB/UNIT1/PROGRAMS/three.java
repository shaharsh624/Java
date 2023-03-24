import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Performing all arithmetic, comparision, logical and bitwise operations

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        //Arithmetic Operations
        System.out.println("\nAddition: " + (a + b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
        System.out.println("Exponation: " + (a ^ b));

        //Comparision Operations
        System.out.println("\nGreater than: " + (a > b));
        System.out.println("Greater than or equals to: " + (a >= b));
        System.out.println("Less than: " + (a < b));
        System.out.println("Less than or equals to: " + (a <= b));
        System.out.println("Equals to: " + (a == b));
        System.out.println("Not equals to: " + (a != b));

        //Logical Operations
        

        //Bitwise Operations

        //Bitwise AND
        System.out.println("\na&b = " + (a & b));

        //Bitwise OR
        System.out.println("a|b = " + (a | b));

        //Bitwise XOR
        System.out.println("a^b = " + (a ^ b));

        //Bitwise NOT
        System.out.println("~a = " + ~a);
    }
}
