package PRACTICE.FileHandling;
import java.io.*;

class Student implements Serializable{
    String name;
    int id;
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
}

public class SerializableFile {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student(359,"Harsh");
        Student s2 = new Student(403,"Vandeet");

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("fileobject.txt"));
        out.writeObject(s1);
        out.flush();
        out.close();
        System.out.println("Success!");

        ObjectInputStream oin = new ObjectInputStream(new FileInputStream("fileobject.txt"));
        Student s = (Student) oin.readObject(); // Whichever object is written, gets readen
        System.out.println(s.id + " " + s.name);
        oin.close();
    }
}
