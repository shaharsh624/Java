package UNIT3.PROGRAMS;
// Four

import java.io.Serializable;
import java.io.*;
class Student implements Serializable{
    int rollNo;
    String name;
    public Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }
}

public class FourStudent {
	public static void main(String[] args) {
	    try{
	        Student s1 = new Student(359, "Harsh");
	        Student s2 = new Student(377, "Karan");
	        Student s3 = new Student(387, "Kushagara");

	        FileOutputStream fout = new FileOutputStream("f1.txt");
	        ObjectOutputStream oot = new ObjectOutputStream(fout);

	        oot.writeObject(s1);
	        oot.writeObject(s2);
	        oot.writeObject(s3);
	        oot.flush();
	        oot.close();
	        System.out.println("Done Succesfully!");

			// Reading the file
			FileReader fr = new FileReader("C:\\Users\\harsh\\OneDrive - pdpu.ac.in\\HARSH\\CODE\\JAVA\\LAB\\UNIT 3\\src\\f1.txt");
			int i;
			while((i= fr.read())!=-1){
                System.out.print((char)i);
			}
			fr.close();

	    }
	    catch(Exception e){
	        System.out.println(e);
	    }
	}
}