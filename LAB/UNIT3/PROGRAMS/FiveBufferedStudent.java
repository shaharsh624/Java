import java.io.*;
import java.io.BufferedReader;

public class FiveBufferedStudent {
    public static void main(String[] args) throws IOException{  

        // Buffered Write
        FileWriter writer = new FileWriter("C:\\Users\\harsh\\OneDrive - pdpu.ac.in\\HARSH\\CODE\\JAVA\\LAB\\UNIT 3\\src\\f1.txt");
        BufferedWriter buffer = new BufferedWriter(writer);  
        buffer.write("This is Java");  
        buffer.close();  

        System.out.println("Success");  
        
        // Buffered Read
        FileReader fr = new FileReader("C:\\Users\\harsh\\OneDrive - pdpu.ac.in\\HARSH\\CODE\\JAVA\\LAB\\UNIT 3\\src\\f1.txt");
        BufferedReader br = new BufferedReader(fr);
        int i;    
        while((i=br.read())!=-1) {
            System.out.print((char)i);  
        }  
        br.close();    
        fr.close();  
    }
}