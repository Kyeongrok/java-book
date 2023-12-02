package org.book.chapter07.p034;

public class AccountWithConstructor {
    int balance;

    public AccountWithConstructor(int balance) { // 생성자
        this.balance = balance;
    }

    public boolean isSufficient(){
        return balance >= 10_000;
    }
}
