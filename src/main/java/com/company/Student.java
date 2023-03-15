package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private String fullName;
    private Map<String, List<Integer>> grades;

    public String getFullName() {
        return fullName;
    }

    public Map<String, List<Integer>> getGrades() {
        return grades;
    }


    public Student(String fullName) {
        this.fullName = fullName;
        grades = new HashMap<>();
    }

    public void addGrade(String subject, int grade) {
        if (!grades.containsKey(subject)) {
            grades.put(subject, new ArrayList<>());
        }
        grades.get(subject).add(grade);
    }

    public double averageGrade(String subject) {
        if (!grades.containsKey(subject)) {
            return 0;
        }
        int sum = 0;
        List<Integer> subGrade = grades.get(subject);
        for (Integer integer : subGrade) {
            sum += integer;
        }
        return (double) sum / subGrade.size();
    }

    public List<Integer> allGrades(String subject) {
        return grades.get(subject);
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", grades=" + grades +
                '}';
    }
}
