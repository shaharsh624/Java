import java.util.Scanner;

public class six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Counting vowels and consonants in a line

        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int vowel = 0;
        int space = 0;
        for(int i = 0; i < s.length(); i ++){
            char letter = s.charAt(i);
            if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                vowel = vowel + 1;
            }
            else if(letter == ' '){
                space ++;
            }
        }
        int conso = s.length() - vowel - space;
        System.out.println("Number of vowels are " + vowel);
        System.out.println("Number of consonants are " + conso);

        
    }
}
