package src;

import java.util.Scanner;
public class PDEU_DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=n-i; j>0; j--){
                System.out.print(" ");
            }

            for (int k=1; k<=i; k++){
                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i=1; i<=n; i++){
            for (int k=1; k<=i; k++){
                System.out.print(" ");
            }

            for (int j=n-i; j>0; j--){
                System.out.print("* ");
            }

            System.out.println();
        }
        sc.close();
    }
}
