import java.util.Scanner;

public class seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Counting number of words that start with capital letters

        System.out.print("Enter a sentence: ");
        String line = sc.nextLine();
        int word = 0;
        char firstletter = line.charAt(0);
            if(firstletter >= 65 && firstletter <= 90){
                word ++;
            }
        for(int i = 0; i < line.length(); i ++){
            char letter = line.charAt(i);
            if(letter == ' '){
                char first = line.charAt(i + 1);
                if(first >= 65 && first <= 90){
                    word ++;
                }
            }
        }
        System.out.println("Total words starting with capital letters are " + word);
    }
}
