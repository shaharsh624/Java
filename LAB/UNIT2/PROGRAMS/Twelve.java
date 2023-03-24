import java.util.Scanner;

public class Twelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Program to compute if one string is rotation of another

        System.out.print("Enter word 1: ");
        String a = sc.next();
        System.out.print("Enter word 2: ");
        String b = sc.next();
        int count = 0;
        for(int i = 0; i < a.length(); i ++) {
            if(a.charAt(i) == (b.charAt(b.length() - i - 1))) {
                count ++;
            }
        }
        if(count == a.length()) {
            System.out.println(a + " is rotation of " + b);
        }
        else {
            System.out.println(a + " is not rotation of " + b);
        }
    }
}
