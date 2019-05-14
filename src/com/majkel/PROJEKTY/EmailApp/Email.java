package com.majkel.PROJEKTY.EmailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private int defaultPasswordLenght = 10;
    private String department;
    private String email;
    private String alternateEmail;
    private int mailboxCapacity = 500;
    private String companySuffix = "xyzcompany.com";
    private Scanner sc = new Scanner(System.in);

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created: " + this.firstName + " " + this.lastName+"\n");

        // Call a method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department is " + this.department +".");

        // Call a method that returns a random password
        this.password = randomPassword(defaultPasswordLenght);
        System.out.println("Your password is: " + this.password);

        //  Combine elements to generate email
        this.email = this.firstName.toLowerCase() + "." + this.lastName.toLowerCase() + "@" + this.department + "." + this.companySuffix;
        System.out.println("Your email is: " + this.email);
    }

    // Ask for the department
    private String setDepartment() {
        System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter the department:");
        int departmentChoice = sc.nextInt();
        if (departmentChoice == 1) {
            return "sales";
        } else if (departmentChoice == 2) {
            return "development";
        } else if (departmentChoice == 3) {
            return "accounting";
        } else {
            return null;
        }

    }

    // Generate a random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@#$%";
        char[] passwordChar = new char[length];
        for (int i = 0; i <length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            passwordChar[i] = passwordSet.charAt(rand);
        }
        return new String(passwordChar);
    }

    // Set the mailbox capacity
    public void setEmailCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    // Set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    // Change the password
    public void changePassword(String password){
        this.password = password;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getPassword() {
        return password;
    }
}
