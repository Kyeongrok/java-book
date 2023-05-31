package org.book.chapter09;

public class AdminUserTest {
    public static void main(String[] args) {
        User user = new User("김경록", 37, "kyeongrok@example.com");
        AdminUser admin = new AdminUser("김관리", 36, "admin@example.com", 3);

        user.displayUserInfo();
        admin.displayUserInfo();
    }
}
