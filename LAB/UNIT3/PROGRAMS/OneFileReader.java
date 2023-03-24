import java.io.FileReader;
import java.io.IOException;

public class OneFileReader {
    public static void main(String[] args) throws IOException {
        int i, nword=1, nline=1, nsentence=1, nchar=0;
        try{
            FileReader fr = new FileReader("C:\\Users\\harsh\\OneDrive - pdpu.ac.in\\HARSH\\CODE\\JAVA\\LAB\\UNIT 3\\src\\one.txt");
            while((i= fr.read())!=-1){
                System.out.print((char)i);
                nchar++;
                switch((char)i){
                    case ' ':
                        nword++;
                        break;
                    case '.':
                        nsentence++;
                        break;
                    case '\n':
                        nline++;
                        nword++;
                        break;
                }
            }
            System.out.print("\nNumber of Sentences: "+nsentence);
            System.out.print("\nNumber of Words: "+nword);
            System.out.print("\nNumber of Characters: "+(nchar-nword));
            System.out.print("\nNumber of Lines: "+nline);
            fr.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}