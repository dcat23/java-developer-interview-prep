package com.dcat.interviewprep;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void Student_GradeComparator() {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Macchiato", 84, 93));
        students.add(new Student("Latte", 103, 73));
        students.add(new Student("Expresso", 140, 88));

        // Sorting the list using the comparator
        students.sort(new StudentGradeComparator());

        // ascending order
        assertEquals(students.getFirst().getGrade(), 73);
    }

    @Test
    public void Student_AgeComparator() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Latte", 103, 73));
        students.add(new Student("Macchiato", 84, 93));
        students.add(new Student("Espresso", 140, 88));

        // Sorting the list using the comparator
        students.sort(new StudentAgeComparator());

        // ascending order
        assertEquals(students.getFirst().getAge(), 84);
    }

    @Test
    public void Student_comparable() {
        Student student1 = new Student("Macchiato", 84, 93);
        Student student2 = new Student("Espresso", 140, 88);


        // Student 1 is younger so result is negative
        assertEquals(student1.compareTo(student2), -1);

        // Student 2 is older so result is positive
        assertEquals(student2.compareTo(student1), 1);
    }
}