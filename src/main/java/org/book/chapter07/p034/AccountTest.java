package org.book.chapter07.p034;

public class AccountTest {
    public static void main(String[] args) {
        Account accountA = new Account();
        Account accountB = new Account();

        System.out.printf("A계좌에 잔액이 충분한지? %b\n", accountA.isSufficient());
        System.out.printf("B계좌에 잔액이 충분한지? %b\n", accountB.isSufficient());
    }
}
