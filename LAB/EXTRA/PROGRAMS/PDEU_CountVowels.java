package src;

import java.util.Scanner;
public class PDEU_CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = "yes";
        while (x.equals("yes")){
            System.out.print("Enter a sentence: ");
            String str = sc.nextLine();
            String s = str.toLowerCase();
            int n = s.length();
            int a=0, e=0, i=0, o=0, u=0;

            for (int j=0;j<n;j++){
                char letter = s.charAt(j);
                if(letter == 'a' ){
                    a++;
                }
                if(letter == 'e' ){
                    e++;
                }
                if(letter == 'i' ){
                    i++;
                }
                if(letter == 'o' ){
                    o++;
                }
                if(letter == 'u' ){
                    u++;
                }
            }
            System.out.println("Number of 'a': " + a);
            System.out.println("Number of 'e': " + e);
            System.out.println("Number of 'i': " + i);
            System.out.println("Number of 'o': " + o);
            System.out.println("Number of 'u': " + u);

            System.out.println("Do you want to continue?");
            x = sc.nextLine();
        }
        System.out.println("Thankyou! for your Time");
        sc.close();
    }
}