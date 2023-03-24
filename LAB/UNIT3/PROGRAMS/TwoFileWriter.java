import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TwoFileWriter {
    public static void main(String[] args) throws IOException {
        int i;
        try {
            FileReader fr = new FileReader("C:\\Users\\harsh\\OneDrive - pdpu.ac.in\\HARSH\\CODE\\JAVA\\LAB\\UNIT 3\\src\\one.txt");
            FileWriter wr = new FileWriter("C:\\Users\\harsh\\OneDrive - pdpu.ac.in\\HARSH\\CODE\\JAVA\\LAB\\UNIT 3\\src\\two.txt");
            System.out.println("\nReading file - one.txt : ");
            while((i= fr.read())!=-1) {
                System.out.print((char)i);
                char j =Character.toUpperCase((char)i);
                wr.write(j);
            }
            wr.close();
            System.out.println("\n\nWritten file in UpperCase - two.txt : ");

            FileReader fwr = new FileReader("C:\\Users\\harsh\\OneDrive - pdpu.ac.in\\HARSH\\CODE\\JAVA\\LAB\\UNIT 3\\src\\two.txt");
            while((i= fwr.read())!=-1) {
                System.out.print((char)i);
            }
            fr.close();
            fwr.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}