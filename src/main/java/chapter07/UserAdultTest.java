package chapter07;

public class UserAdultTest {
    public static void main(String[] args) {
        UserAdult user1 = new UserAdult();
        user1.name = "김미미";
        user1.age = 14;
        UserAdult user2 = new UserAdult();
        user2.name = "김나나";
        user2.age = 37;
        System.out.printf("%s는 성인입니까? %s\n", user1.name, user1.isAdult());
        System.out.printf("%s는 성인입니까? %s\n", user2.name, user2.isAdult());
    }
}