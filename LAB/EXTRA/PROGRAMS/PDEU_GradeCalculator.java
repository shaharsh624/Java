package src;

import java.util.Scanner;

public class PDEU_GradeCalculator {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of subject 1: ");
        float marks_sub1 = sc.nextFloat();
        System.out.print("Enter credit of subject 1: ");
        int credit_sub1 = sc.nextInt();

        System.out.print("Enter marks of subject 2: ");
        float marks_sub2 = sc.nextFloat();
        System.out.print("Enter credit of subject 2: ");
        int credit_sub2 = sc.nextInt();

        int grade_1;
        int grade_2;
        // For Subject 1
        if (marks_sub1>79){
            grade_1 = 10;
        }
        else if (marks_sub1>69){
            grade_1 = 9;
        }
        else if (marks_sub1>59){
            grade_1 = 8;
        }
        else if (marks_sub1>54){
            grade_1 = 7;
        }
        else if (marks_sub1>49){
            grade_1 = 6;
        }
        else if (marks_sub1>44){
            grade_1 = 5;
        }
        else if (marks_sub1>40){
            grade_1 = 4;
        }
        else {
            grade_1 = 0;
        }

        // For Subject 2
        if (marks_sub2>79){
            grade_2 = 10;
        }
        else if (marks_sub2>69){
            grade_2 = 9;
        }
        else if (marks_sub2>59){
            grade_2 = 8;
        }
        else if (marks_sub2>54){
            grade_2 = 7;
        }
        else if (marks_sub2>49){
            grade_2 = 6;
        }
        else if (marks_sub2>44){
            grade_2 = 5;
        }
        else if (marks_sub2>40){
            grade_2 = 4;
        }
        else {
            grade_2 = 0;
        }

        float spi = (float)((grade_1*credit_sub1) + (grade_2*credit_sub2))/(credit_sub1+credit_sub2);

        // Grade
        String grade;
        if (spi>9){
            grade = "'A+'";
        }
        else if (spi>8){
            grade = "'A'";
        }
        else if (spi>7){
            grade = "'B+'";
        }
        else if (spi>6){
            grade = "'B'";
        }
        else if (spi>5){
            grade = "'C+'";
        }
        else if (spi>4){
            grade = "'C'";
        }
        else {
            grade = "'F'";
        }
        System.out.println("SPI: " + spi);
        System.out.println("Grade: " + grade);
        sc.close();
    }
}