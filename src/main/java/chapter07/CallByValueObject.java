package chapter07;

public class CallByValueObject {
    public User callByValueObjectTest(User value) {
        value.age += 100;
        return value;
    }
    public static void main(String[] args) {
        CallByValueObject cbv = new CallByValueObject();
        User user1 = new User();
        user1.age = 37;
        User result = cbv.callByValueObjectTest(user1);
        System.out.println("result.age = " + result.age);
        System.out.println("user1.age = " + user1.age);
    }
}