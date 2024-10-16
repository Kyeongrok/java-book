package chapter06;

import java.util.Scanner;

public class PaymentWithPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String correctPassword = "secret"; // 예시로 사용하는 비밀번호
        int attempts = 0;
        boolean paymentSuccessful = false;
        while (!paymentSuccessful && attempts < 3) {
            System.out.print("비밀번호를 입력하세요: ");
            String enteredPassword = scanner.next();
            if (!enteredPassword.equals(correctPassword)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 시도하세요.");
                attempts++;
                continue; // continue문을 사용해 루프의 처음으로 이동
            }
            System.out.println("비밀번호가 일치합니다. 결제가 진행됩니다.");
            paymentSuccessful = true;
            System.out.println("다음 단계 진행...");
        }
        if (!paymentSuccessful) {
            System.out.println("비밀번호 입력 횟수를 초과하여 프로그램을 종료합니다.");
        }
        // Scanner를 닫습니다.
        scanner.close();
    }
}