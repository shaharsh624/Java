import java.io.*;

public class SixReadWrite {
    public static void main(String[] args) throws IOException {
        int data;
        try {
            Writer wr = new FileWriter("C:\\Users\\harsh\\OneDrive - pdpu.ac.in\\HARSH\\CODE\\JAVA\\LAB\\UNIT 3\\src\\six.txt");
            Reader fr = new FileReader("C:\\Users\\harsh\\OneDrive - pdpu.ac.in\\HARSH\\CODE\\JAVA\\LAB\\UNIT 3\\src\\six.txt");
            
            // Writing in file - six.txt
            wr.write("This is some text in six.txt");
            wr.close();

            while((data= fr.read())!=-1) {
                System.out.print((char)data);
            }
            fr.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}