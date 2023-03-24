package PRACTICE.GUI;
import java.io.*;
public class BufferedReaderWriter {
    public static void main(String[] args) throws IOException{

        // FileWriter fw = new FileWriter("fileBuffered.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter("fileBuffered.txt"));
        bw.write("Hello!\nThis is Buffered Reader-Writer");
        bw.close();
        System.out.println("Success");


        // FileReader fr = new FileReader("fileBuffered.txt");
        BufferedReader br = new BufferedReader(new FileReader("fileBuffered.txt"));
        // Either use this ---
        int i;
        while((i=br.read())!=-1){
            System.out.print((char)i);
        }
        /* --- Or Use this
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        br.close();
        fr.close();
        */
    }
}