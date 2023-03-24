import java.util.Scanner;

public class SevenDivideByZero {
    public static void main(String[] args) {
        int div=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();  
        try{
            div = n1/n2;
        }

        catch(ArithmeticException e){
            System.out.println("Divide By Zero Error");
            System.out.println("n1 / n2 = "+(div));
        }
    }
}