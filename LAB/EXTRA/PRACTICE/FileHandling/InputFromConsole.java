package PRACTICE.FileHandling;
import java.io.*;
public class InputFromConsole {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your Name :: ");
        String name = br.readLine();
        System.out.println("Welcome " + name + "!");
    }
}
