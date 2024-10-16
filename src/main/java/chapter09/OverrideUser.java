package chapter09;

public class OverrideUser {
    private String name;
    private int age;
    private String email;
    public OverrideUser(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
    public void displayUserInfo() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("이메일: " + email);
    }
}