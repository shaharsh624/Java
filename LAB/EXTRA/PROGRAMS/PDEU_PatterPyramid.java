package src;

import java.util.Scanner;
public class PDEU_PatterPyramid {
    public static void PatternPyramid(int n) {
        int i,j;
        for (i=1;i<=n;i++){
            for (j=0;j<n-i;j++){
                System.out.print("  ");
            }
            for (int k=0;k<i;k++) {
                System.out.print("* ");
            }
            for (int m=0;m<=i;m++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PatternPyramid(n);
    sc.close();
    }
}