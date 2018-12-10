package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class StudentsMass {
    public Student[] students;
    public StudentsMass(int count)
    {
        students = new Student[count];
    }

    static private Comparator<Student> srt;
    static {
        srt = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.getID(), o2.getID());
            }
        };
    }

    public void fillStudents(String[] arrayNames, int[] arrayID)
    {
        for (int i = 0; i < students.length; i++)
        {
            students[i] = new Student(arrayNames[i], arrayID[i]);
        }
    }

    public void sortStudents()
    {
        Arrays.sort(students, srt);
    }

    static public void main(String[] args)
    {
        StudentsMass std = new StudentsMass(5);
        String[] str = {"Петя", "Вася", "Вова", "Глеб", "Саша"};
        int[] mas = {10023, 10000, 23100, 45000, 10001};
        std.fillStudents(str, mas);
        std.sortStudents();
        for (Student stud: std.students)
        {
            System.out.print(stud);
        }
    }
}
