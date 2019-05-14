package com.majkel.PROJEKTY.School.Management.System;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1,"Lizzy Thompson", 2500);
        Teacher mellisa = new Teacher(2,"Mellisa Throne",3000);
        Teacher bob = new Teacher(3,"Bob Moore", 3500);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(bob);

        Student tamasha = new Student(1,"Tamasha Brick",4);
        Student james = new Student(1,"James Hoban",5);
        Student john = new Student(1,"John Russel",3);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(james);
        studentList.add(john);

        School AMSzczecin = new School(teacherList,studentList);

        tamasha.payFees(5000);
        james.payFees(6000);
        System.out.println("Maritime Academy of Szczecin has earned $" + AMSzczecin.getTotalMoneyEarned() + " money.");

        System.out.println("------Making AMSzczecin pay salary------");

        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("AMSzczecin has spent for salary to " + lizzy.getName() + " and now has " + AMSzczecin.getTotalMoneyEarned());
        mellisa.receiveSalary(mellisa.getSalary());
        System.out.println("AMSzczecin has spent for salary to " + mellisa.getName() + " and now has " + AMSzczecin.getTotalMoneyEarned());

        System.out.println(james);
        System.out.println(lizzy);

    }
}
