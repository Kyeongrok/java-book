package org.book.chapter08;

public class StudentTest2 {
    public static void main(String[] args) {
        Student student1 = new Student("김경록", 1, 1);
        Student student2 = new Student("김미미", 1, 1);
        Student student3 = new Student("이루리", 13, 1, 1);
        Student student4 = new Student("최정하", 15, 1, 1);

        student1.printInfo();
        student2.printInfo();
        student3.printInfo();
        student4.printInfo();
    }
}
