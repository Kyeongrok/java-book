package org.book.chapter08.questions;

public class HighSchoolStudent {
    private String name;
    private int age;
    private String schoolName;

    public HighSchoolStudent(String name, int age, String schoolName) {
        this.name = name;
        this.age = age;
        this.schoolName = schoolName;
    }

    public static void main(String[] args) {
        HighSchoolStudent student1 = new HighSchoolStudent("Matthew", 17, "Seoul International School");
        HighSchoolStudent student2 = new HighSchoolStudent("Elizabeth", 19, "UK International School");
    }
}
