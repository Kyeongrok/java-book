package chapter08;

public class StudentCtor {
    private String name;
    private int age;
    private int grade;
    private int classNo;
    public StudentCtor(String name, int age, int grade, int classNo) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.classNo = classNo;
    }
    public StudentCtor(String name, int grade, int classNo) {
        this.name = name;
        this.age = grade + 13;
        this.grade = grade;
        this.classNo = classNo;
    }
    public void printInfo() {
        System.out.printf("%s %d세 %d학년 %d반\n", name, age, grade, classNo);
    }
}