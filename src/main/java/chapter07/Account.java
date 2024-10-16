package chapter07;

public class Account {
    int balance = 1_000_000; // 상태
    public boolean isSufficient() { // 동작
        return balance >= 10_000;
    }
}