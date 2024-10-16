package chapter03;

public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        user.name = "김경록";
        user.phoneNumber = "010-0000-0000";
        user.age = 37;
        System.out.println("이름: " + user.name);
        System.out.println("전화번호: " + user.phoneNumber);
        System.out.println("나이: " + user.age);
    }
}