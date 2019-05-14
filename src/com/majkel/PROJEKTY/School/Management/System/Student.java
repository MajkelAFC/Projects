package com.majkel.PROJEKTY.School.Management.System;

//This class is responsible for keeping the track of
//students fees,names, grades and fees paids.

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To create a new student by initializing.
     * Fees for every student is 30,000 $ per year.
     * @param id id for the student: unique.
     * @param name name for the student.
     * @param grade grade for the student.
     */

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 30000;
    }

    /**
     * Keep adding the fees to feesPaid field.
     * Add the fees to the fees paid.
     * The school is going to receive the funds.
     * @param fees the fees that the student pays.
     */
    public void payFees(int fees){
        this.feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     * Used to update the student's grade.
     * @param grade new grade for the student.
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void getRemainingFees(){
        this.feesTotal -= this.feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name: " + this.name + " total fees paid so far $ " + this.feesPaid;
    }
}
