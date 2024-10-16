package chapter07;

public class BankAccountV2 {
    int balance = 1000;
    public boolean printIsSufficient() { // 리턴 타입, 메서드 이름 변경
        return balance >= 1500;
    }
}