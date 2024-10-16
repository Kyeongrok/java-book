package chapter08;

public class OtherStudentCtorTest {
    public static void main(String[] args) {
        OtherStudentCtor Student1 = new OtherStudentCtor("김경록", 1, 1);
        OtherStudentCtor Student2 = new OtherStudentCtor("김미미", 1, 1);
        Student1.printInfo();
        Student2.printInfo();
    }
}