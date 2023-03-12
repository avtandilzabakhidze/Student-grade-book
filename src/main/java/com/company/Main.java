package com.company;

public class Main {
    public static void main(String[] args) {
Student student = new Student("gela");
student.addGrade("qartuli",10);
student.addGrade("qartuli",9);
student.addGrade("istoria",10);

        System.out.println(student.averageGrade("qartuli"));
        System.out.println(student.allGrades("qartuli"));
    }
}
