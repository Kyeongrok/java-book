package org.book.chapter08;

public class Student {
    String name;
    int age;
    String phone;

    public Student() {
        this(14);
    }

    public Student(int age) {
        this.age = age;
    }
}
