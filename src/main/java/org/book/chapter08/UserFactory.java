package org.book.chapter08;

public class UserFactory {
    public User getAdultUser() {
        User user = new User();
        user.age = 34;
        return user;
    }
}
