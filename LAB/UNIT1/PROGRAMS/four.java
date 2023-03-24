import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Calculating grade, gradepoints and SPI
        
        String grade1, grade2;
        int gradepoints1, gradepoints2;
        //Inputing marks and credits of first subject
        System.out.print("\nEnter marks of first subject: ");
        int m1 = sc.nextInt();
        System.out.print("Enter credits of first subject: ");
        int c1 = sc.nextInt();

        //Inputing marks and credits of second subject
        System.out.print("\nEnter marks of second subject: ");
        int m2 = sc.nextInt();
        System.out.print("Enter credits of second subject: ");
        int c2 = sc.nextInt();
        
        //Calculating grades of first subject
        if(m1 >= 80){
            grade1 = "O";
        }
        else if(m1 >= 70){
            grade1 = "A+";
        }
        else if(m1 >= 60){
            grade1 = "A";
        }
        else if(m1 >= 55){
            grade1 = "B+";
        }
        else if(m1 >= 50){
            grade1 = "B";
        }
        else if(m1 >= 45){
            grade1 = "C";
        }
        else if(m1 >= 40){
            grade1 = "P";
        }
        else {
            grade1 = "F";
        }

        //Calculating grades of second subject
        if(m2 >= 80){
            grade2 = "O";
        }
        else if(m2 >= 70){
            grade2 = "A+";
        }
        else if(m2 >= 60){
            grade2 = "A";
        }
        else if(m2 >= 55){
            grade2 = "B+";
        }
        else if(m2 >= 50){
            grade2 = "B";
        }
        else if(m2 >= 45){
            grade2 = "C";
        }
        else if(m2 >= 40){
            grade2 = "P";
        }
        else {
            grade2 = "F";
        }

        //Calculating gradepoints of first subject
        switch(grade1){
            case "O":
                gradepoints1 = 10;
                break;
            case "A+":
                gradepoints1 = 9;
                break;
            case "A":
                gradepoints1 = 8;
                break;
            case "B+":
                gradepoints1 = 7;
                break;
            case "B":
                gradepoints1 = 6;
                break;
            case "C":
                gradepoints1 = 5;
                break;
            case "P":
                gradepoints1 = 4;
                break;
            default:
                gradepoints1 = 0;
                break;
        }

        //Calculating gradepoints of second subject
        switch(grade2){
            case "O":
                gradepoints2 = 10;
                break;
            case "A+":
                gradepoints2 = 9;
                break;
            case "A":
                gradepoints2 = 8;
                break;
            case "B+":
                gradepoints2 = 7;
                break;
            case "B":
                gradepoints2 = 6;
                break;
            case "C":
                gradepoints2 = 5;
                break;
            case "P":
                gradepoints2 = 4;
                break;
            default:
                gradepoints2 = 0;
                break;
        }

        //Calculating SPI
        float spi = (float)((c1 * gradepoints1) + (c2 * gradepoints2)) / (c1 + c2);

        System.out.println("\nGrade of first subject is " + grade1);
        System.out.println("Gradepoint of first subject is " + gradepoints1);
        System.out.println("Grade of second subject is " + grade2);
        System.out.println("Gradepoint of second subject is " + gradepoints2);
        System.out.println("SPI is " + spi);
        
    }
}
