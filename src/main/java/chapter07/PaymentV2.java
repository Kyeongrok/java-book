package chapter07;

public class PaymentV2 {
    public static void main(String[] args) {
        BankAccountV2 bankAccountV2 = new BankAccountV2();
        boolean isSufficient = bankAccountV2.printIsSufficient();
        if(isSufficient) {
            System.out.println("결제를 요청합니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }
}