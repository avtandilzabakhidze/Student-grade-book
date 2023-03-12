package com.company;

import java.util.ArrayList;
import java.util.List;

public class Gradesbook {
private List<Student> students;

    public Gradesbook() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }
}
