
import java.io.Serializable;
import java.io.*;
class FourStudent implements Serializable{
    int rollNo;
    String name;
    public FourStudent(int id, String name){
        this.rollNo = rollNo;
        this.name = name;
    }
}

public class Main {
	public static void main(String[] args) {
	    try{
	        FourStudent s1 = new FourStudent(359, "Harsh");
	        Student s2 = new Student(377, "Karan");
	        Student s3 = new Student(387, "Kushagra");
	        FileOutputStream fout = new FileOutputStream("f1.txt");
	        ObjectOutputStream oot = new ObjectOutputStream(fout);
	        oot.writeObject(s1);
	        oot.writeObject(s2);
	        oot.writeObject(s3);
	        oot.flush();
	        oot.close();
	        System.out.println("Done Succesfully!");
	    }
	    
	    catch(Exception e){
	        System.out.println(e);
	    }
	}
}