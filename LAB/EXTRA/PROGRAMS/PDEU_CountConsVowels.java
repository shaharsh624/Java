package src;

import java.util.Scanner;
public class PDEU_CountConsVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = str.toLowerCase();
        int n = s.length();
        int vowelCount=0;
        int ConsCount=0;

        for (int i=0;i<n;i++){
            char letter = s.charAt(i);

             if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                 vowelCount++;
             }
             else{
                 ConsCount++;
             }
        }
        System.out.println("Number of vowels: " + vowelCount + "\nNumber of Consonants: " + ConsCount);
        sc.close();
    }
}
