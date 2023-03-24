import java.util.Scanner;

public class eight{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Count each vowel type in the inputed sentence

        String x = "continue";
        int A = 0, E = 0, I = 0, O = 0, U = 0;
        while(x.equals("continue")){
            System.out.print("Enter a sentence: ");
            String str = sc.nextLine();
            String s = str.toLowerCase();
            int a = 0, e = 0, i = 0, o = 0, u = 0;
            for(int j = 0; j < s.length(); j ++){
                char letter = s.charAt(j);
                if(letter == 'a'){
                    a ++;
                }
                else if(letter == 'e'){
                    e ++;
                }
                else if(letter == 'i'){
                    i ++;
                }
                else if(letter == 'o'){
                    o ++;
                }
                else if(letter == 'u'){
                    u ++;
                }
            }
            System.out.println("Total A in line " + a);
            System.out.println("Total E in line " + e);
            System.out.println("Total I in line " + i);
            System.out.println("Total O in line " + o);
            System.out.println("Total U in line " + u);
            A = A + a;
            E = E + e;
            I = I + i;
            O = O + o;
            U = U + u;

            System.out.print("Enter your next step: ");
            x = sc.nextLine();
        }
        System.out.println("Total A in all lines " + A);
        System.out.println("Total E in all lines " + E);
        System.out.println("Total I in all lines " + I);
        System.out.println("Total O in all lines " + O);
        System.out.println("Total U in all lines " + U);
    }
}