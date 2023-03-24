import java.util.*;

class Course{
    int courseCode;
    String courseName;
    double marks;

    Course(int courseCode, String courseName, double marks) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.marks = marks;
    }

    Course(Course [] c){
        for (int i=0; i<3; i++) {
            courseCode = c[i].courseCode;
            courseName = c[i].courseName;
            marks = c[i].marks;
        }
    }
}

class Student extends Course{
    int rollNo;
    String name;
    Course c1;
    Course c2;
    Course c3;
    double totalMarks;
    static double highestMarks;

    public Student(int rollNo, String name, Course[] courses, double totalMarks) {
        super(courses);
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] s = new Student[2];
        double[] totalMarks = new double[2];

        for (int i=0 ; i<2 ; i++){
            System.out.print("\nEnter Roll No. of Student " + (i+1) + ": ");
            int rollNo = sc.nextInt();
            System.out.print("Enter Name of Student " + (i+1) + ": ");
            String name = sc.next();

            Course[] c = new Course[3];
            int total = 0;

            for (int j=0 ; j<3 ; j++){
                System.out.print("\nEnter Course " + (j+1) + " Code: ");
                int courseCode = sc.nextInt();
                System.out.print("Enter Course " + (j+1) + " Name: ");
                String courseName = sc.next();
                System.out.print("Enter Marks of Course " + (j+1) + ": ");
                double courseMarks = sc.nextDouble();

                c[j] = new Course(courseCode, courseName, courseMarks);
                total += courseMarks;
            }

            s[i] = new Student(rollNo, name, c, total);
            s[i].totalMarks = total;
            totalMarks[i] = total;
        }
        Student.highestMarks = Max(totalMarks);
        System.out.print("Highest marks amongst Students: " + Student.highestMarks);
    }

    static double Max(double[] totalMarks) {
        double max = totalMarks[0];
        for (double totalMark : totalMarks) {
            if (totalMark > max) {
                max = totalMark;
            }
        }
        return max;
    }
}