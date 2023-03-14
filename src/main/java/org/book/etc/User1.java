package org.book.etc;

import java.util.Scanner;

public class User1 {
    private String name;
    private int age;
    private String email;

    public User1(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public void print() {
        System.out.printf("이름: %s, 나이: %d, 이메일: %s\n", name, age, email);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] info = input.split(" ");

        if (info.length != 3) {
            System.out.println("잘못된 입력입니다.");
            System.exit(0);
        }

        User1 user = new User1(info[0], Integer.parseInt(info[1]), info[2]);
        user.print();

        sc.close();
    }
}