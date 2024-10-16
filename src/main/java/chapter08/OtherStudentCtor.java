package chapter08;

public class OtherStudentCtor {
    private String name;
    private int age;
    private int grade;
    private int classNo;
    public OtherStudentCtor(String name, int age, int grade, int classNo) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.classNo = classNo;
    }
    public OtherStudentCtor(String name, int grade, int classNo) {
        this(name, grade + 13, grade, classNo); // this() 적용
    }
    public void printInfo() {
        System.out.printf("%s %d세 %d학년 %d반\n", name, age, grade, classNo);
    }
}