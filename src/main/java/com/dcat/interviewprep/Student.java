package com.dcat.interviewprep;

public class Student implements Comparable <Student> {

    private String name;
    private int age;
    private int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
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

    public String getName() {
        return name;
    }
}
