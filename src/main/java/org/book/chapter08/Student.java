package org.book.chapter08;

public class Student {
    private String name;
    private int age;
    private int grade;
    private int classNo;

    public Student(String name, int age, int grade, int classNo) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.classNo = classNo;
    }

    public Student(String name, int grade, int classNo) {
        this(name, grade + 13, grade, classNo);
    }

    public void printInfo() {
        System.out.printf("%s %d세 %d학년 %d반\n", name, age, grade, classNo);
    }
}
