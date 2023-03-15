package com.company;

public class Main {
    public static void main(String[] args) {


        Student student1 = new Student("ana");
        student1.addGrade("math", 8);
        student1.addGrade("math", 6);
        student1.addGrade("geography", 6);


        Student student2 = new Student("nika");
        student2.addGrade("math", 5);
        student2.addGrade("math", 7);

        Student student = new Student("mary");
        student.addGrade("math", 10);
        student.addGrade("math", 9);
        student.addGrade("geography", 10);

        Gradesbook gb = new Gradesbook();
        gb.addStudent(student);
        gb.addStudent(student1);
        gb.addStudent(student2);
        System.out.println(gb.getStudents());
        System.out.println("-------------------------------------");
        System.out.println(gb.getHighScore("math"));
        System.out.println(gb.getLowScore("math"));
    }
}
