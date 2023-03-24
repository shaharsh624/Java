package src;

import java.util.Scanner;
public class PDEU_GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a>b){
            if (a>c){
                System.out.println(a + " is greatest");
            }
            else{
                System.out.println(c + " is greatest");
            }
        }

        else{
            if (c>b){
                System.out.println(c + " is greatest");
            }
            else{
                System.out.println(b + " is greatest");
            }
        }
        sc.close();
    }
}
