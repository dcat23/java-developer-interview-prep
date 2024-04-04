package com.dcat.interviewprep;

public class Student implements Comparable <Student> {

    private int age;
    private int grade;

    public Student(int age, int grade) {
        this.age = age;
        this.grade = grade;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.age, o.age);
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }
}
