package chapter07;

public class UserAdult {
    String name;
    String phoneNumber;
    int age;
    boolean isAdult() {
        return age >= 18;
    }
}