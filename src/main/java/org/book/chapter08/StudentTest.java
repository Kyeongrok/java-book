package org.book.chapter08;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("김경록",14, 1, 1);
        Student student2 = new Student("김미미",14, 1, 1);
        Student student3 = new Student("김나나",14, 1, 1);

        student1.printInfo();
        student2.printInfo();
        student3.printInfo();
    }
}
