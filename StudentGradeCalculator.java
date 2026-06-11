package CODSOFT;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentGradeCalculator {
    Scanner s = new Scanner(System.in);
    int no;

    void display() {
        System.out.println("Student Grade Calculator");
        System.out.println("============================");
        System.out.println("Enter the number of subjects : ");

        try {
            no = s.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Dont enter mis match data");
            System.exit(0);              // use for stop the program
        }
        int[] mark = new int[no + 1];
        mark[0] = 0;
        System.out.println("Enter the student marks : ");
        for (int i = 1; i <= no; i++) {
            System.out.println("Enter the " + (i) + "st subject mark : ");
            try {
                mark[i] = s.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Dont enter wrong data");
                System.exit(0);       // use for stop the program
            }

        }
        System.out.println("Marks are added");
        System.out.println("=================");
        System.out.println("Student grade ");
        System.out.println("===================");
        System.err.println(mark.length);
        gradeCalculator(mark);

    }

    void gradeCalculator(int[] mark) {
        int total = 0;
        for (int i = 0; i < mark.length; i++) {
            System.out.println(i + mark[i]);
            total = mark[i] + total;
        }
        float average = total / no;
        float percentage = (total / (no * 100)) * 100;
        System.out.println("Total Mark : " + total);
        System.out.println("Average mark : " + average);
        System.out.println("Percentage : " + percentage);
        if (percentage >= 90) {
            System.out.println("Congrates ..........\nYour grade is 'A'");
        }
        if (percentage >= 80 && percentage < 90) {
            System.out.println("Your grade is 'B' Good ....");
        }
        if (percentage >= 70 && percentage < 80) {
            System.out.println("Your grade is 'C' Well Done....");
        }
        if (percentage >= 60 && percentage < 70) {
            System.out.println("Your grade is 'D' Try more ....");
        }
        if (percentage <= 60) {
            System.out.println("Your grade is 'F' Work Hard .....");
        }

    }

    public static void main(String[] args) {
        StudentGradeCalculator sgs = new StudentGradeCalculator();
        sgs.display();
    }

}