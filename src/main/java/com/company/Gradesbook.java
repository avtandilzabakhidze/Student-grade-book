package com.company;

import javax.security.auth.Subject;
import java.util.*;

public class Gradesbook {
private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public Gradesbook() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }
    public List<Student> getHighScore( String subject) {
        List<Student> classStudents = getStudents();
        Collections.sort(classStudents, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.averageGrade(subject), s1.averageGrade(subject));
            }
        });
        return classStudents;
    }



    public List<Student> getLowScore(String subject){
        List<Student> classStudents = getStudents();
        Collections.sort(classStudents, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.averageGrade(subject), o2.averageGrade(subject));
            }
        });
        return classStudents;
    }

}
