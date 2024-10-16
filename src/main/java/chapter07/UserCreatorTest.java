package chapter07;

public class UserCreatorTest {
    public static void main(String[] args) {
        UserCreator userCreator = new UserCreator();
        User user = userCreator.getAdultUser();
        System.out.println(user.age);
    }
}