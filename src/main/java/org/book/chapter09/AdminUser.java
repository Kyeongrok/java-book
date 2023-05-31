package org.book.chapter09;

public class AdminUser extends User {
    private int adminLevel;

    public AdminUser(String name, int age, String email, int adminLevel) {
        super(name, age, email);
        this.adminLevel = adminLevel;
    }

    @Override
    public void displayUserInfo() {
        super.displayUserInfo();
        System.out.println("관리자 레벨: " + adminLevel);
    }
}
