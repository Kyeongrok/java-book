package org.book.chapter12;

public class UserTest {
    public static void main(String[] args) {
        User user = new User("kyeongrok", Role.ADMIN);
        System.out.println(user.getRole());

        if(user.getRole() == Role.ADMIN){
            System.out.println("관리자 입니다.");
        } else {
            System.out.println("관리자가 아닙니다.");
        }
    }
}
