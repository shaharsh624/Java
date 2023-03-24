import java.util.Scanner;
class Distance1{
    float feet;
    float inches;

    void distCalc(int length){
        feet = (length/(12f*2.54f));
        inches = (length*2.54f);
        System.out.println("Feet: " + feet + "\nInches: " + inches);
    }
}

public class OneDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int length = sc.nextInt();
        Distance1 d1 = new Distance1();
        d1.distCalc(length);
    }
}