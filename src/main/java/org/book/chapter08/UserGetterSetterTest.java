package org.book.chapter08;

public class UserGetterSetterTest {
    public static void main(String[] args) {
        UserGetterSetter ugs = new UserGetterSetter();
        int age = ugs.getAge();
        String name = ugs.getName();
        System.out.printf("%s님의 나이는 %d세 입니다.\n", name, age);
    }
}
