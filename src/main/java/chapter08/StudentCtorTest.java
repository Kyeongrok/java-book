package chapter08;

public class StudentCtorTest {
    public static void main(String[] args) {
        StudentCtor studentCtor1 = new StudentCtor("김경록", 1, 1);
        StudentCtor studentCtor2 = new StudentCtor("김미미", 1, 1);
        StudentCtor studentCtor3 = new StudentCtor("이루리", 13, 1, 1);
        StudentCtor studentCtor4 = new StudentCtor("최정하", 15, 1, 1);
        studentCtor1.printInfo();
        studentCtor2.printInfo();
        studentCtor3.printInfo();
        studentCtor4.printInfo();
    }
}