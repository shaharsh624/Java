import java.util.InputMismatchException;
import java.util.Scanner;

// 9-Use of Throws
public class NineUserDefinedException3 {
    static void input() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        throw new InputMismatchException("Demo");
    }
    public static void main(String[] args) {
        try{
            input();
        }
        catch (InputMismatchException e){
            System.out.print("Caught ");
            System.out.println(e);
        }
    }
}