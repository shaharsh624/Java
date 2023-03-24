// 9-Use of Throw
import java.util.Scanner;
class LongLength extends Exception{
    LongLength(String str){
        super(str);
    }
}

public class NineUserDefinedException1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 10 digit Mobile Number: ");
        try {
        long mobileNo = sc.nextLong();
        int len = (int) (Math.log10(mobileNo) + 1);
            if (!(len == 10)) {
                throw new Exception("Please enter 10 digit numbers");
            }
        }
        catch (Exception e) {
            System.out.println("Caught Exception");
            System.out.println(e);
        }
    }
}