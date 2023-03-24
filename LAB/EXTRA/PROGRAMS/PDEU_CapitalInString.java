package src;

import java.util.Scanner;

public class PDEU_CapitalInString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        int CountCapital=0;

        for (int i=0;i<n;i++){
            int letter = str.charAt(i);

            if(letter<=90 && letter>=65){
                CountCapital++;
            }
        }
        System.out.println("Number of Capital Letters: " + CountCapital);
        sc.close();
    }
}