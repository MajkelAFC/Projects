package com.majkel.PROJEKTY.StudentDataBaseApp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourses = 600;
    private static int id = 1000;


    //Constructor: prompt user to enter student's name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
        this.gradeYear = in.nextInt();

        setStudentID();

    }

    //Generate an ID
    private void setStudentID() {
        // Grade level + ID
        id++;
        studentID = gradeYear + "" + id;

    }

    //Enroll in courses
    public void enroll() {
        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q") && !course.equals("q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourses;
            } else {
                break;
            }

        } while (1 != 0);
    }
    //Viev balance
    public void viewBalance(){
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    //Pay Tuition
    public void payTuition(){
        viewBalance();
        System.out.println("Please enter amount of money that you want to pay:");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment: $" + payment);
        viewBalance();
    }

    //Show status

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID " + studentID +
                "\nCourses Enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;
    }

}
