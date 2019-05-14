package com.majkel.PROJEKTY.StudentDataBaseApp;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDataBaseApp {
    public static void main(String[] args) {

        //Ask how many new users we want to add
        System.out.println("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();
        Student[] students = new Student[numOfStudents];

        //Create n numbers of new students
        for (int i = 0; i <numOfStudents ; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
        }
        students[0].toString();
    }
}
