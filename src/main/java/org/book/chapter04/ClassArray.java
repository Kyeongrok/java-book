package org.book.chapter04;

import java.util.Arrays;

public class ClassArray {
    public static void main(String[] args) {
        User[] users = new User[3];
        users[0] = new User();
        users[0].name = "김경록";
        users[0].phoneNumber = "010-1234-5678";
        users[0].age = 37;
        users[1] = new User();
        users[1].name = "김미미";
        users[1].phoneNumber = "010-8765-4321";
        users[1].age = 28;
        users[2] = new User();
        users[2].name = "김지유";
        users[2].phoneNumber = "010-2468-1357";
        users[2].age = 2;

        System.out.println(Arrays.toString(users));
    }
}
