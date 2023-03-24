package PRACTICE.FileHandling;

import java.io.*;
import java.util.Objects;

public class FileReaderWriter {
    public static void main(String[] args) {
        try{
            System.out.println("Writing the File");
            FileWriter fw = new FileWriter("filereadwrite");
            fw.write("Hello!\nThis is File Reader-Writer");
            fw.close();

            System.out.println("\nReading the File");
            FileReader fr = new FileReader("filereadwrite");
            int i;
            while ((i=fr.read())!=-1) {
                System.out.print((char)i);
            }
            fr.close();
            System.out.println("\nSuccessful!");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
