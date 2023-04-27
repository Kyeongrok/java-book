package org.book.chapter07;

public class User {
    String name;
    String phoneNumber;
    int age = 14;

    boolean isAdult() {
        return age >= 18;
    }
}
