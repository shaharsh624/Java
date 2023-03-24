import java.util.Scanner;
public class five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Finding maximum of three numbers

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if(a > b){
            if(a > c){
                System.out.println(a + " is the greatest number");
            }
            else{
                System.out.println(c + " is the greatest number");
            }
        }
        else{
            if(c > b){
                System.out.println(c + " is the greatest number");
            }
            else{
                System.out.println(b + " is the greatest number");
            }
        }
    }
}
