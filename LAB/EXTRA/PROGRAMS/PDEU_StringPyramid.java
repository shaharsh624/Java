package src;

import java.util.Scanner;
public class PDEU_StringPyramid{
//    public static void PatternPyramid(int n, String str) {
//        int i, j;
//        for (i = 0; i <= n; i++) {
//
//            for (j = 0; j <= i; j++) {
//                char letter = str.charAt(j);
//                System.out.println(letter + " ");
//            }
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();

        int i, j;
        for (i = 0; i <= n; i++) {

            for (j = 0; j <= i; j++) {
                char letter = str.charAt(j);
                System.out.println(letter + " ");
            }
        }
    }
}