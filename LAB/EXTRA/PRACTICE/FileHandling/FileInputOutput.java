package PRACTICE.FileHandling;
import java.io.*;
public class FileInputOutput {
    public static void main(String[] args){
        try {
            System.out.println("Writing the File");
            FileOutputStream fout = new FileOutputStream("fileinputoutput.txt");
            String s = "Hello!\nThis is File Input-Output Stream";
            byte b[] = s.getBytes();
            fout.write(b);
            fout.close();

            System.out.println("\nReading the File");
            FileInputStream fin = new FileInputStream("fileinputoutput.txt");
            int i;
            while ((i=fin.read())!=-1) {
               System.out.print((char)i);
            }
            fin.close();
            System.out.println("\nSuccessful!");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

}
