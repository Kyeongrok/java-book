package org.book.chapter06.p02;

public class IsPrimeBreak {
    public static void main(String[] args) {
        int n = 992;
        int cnt = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0){ // 나누어 떨어지는지 확인
                cnt += 1;
                break; // 나누어 떨어지면 멈춤
            }
        }
        if (cnt == 0) {
            System.out.printf("%d는 소수입니다.", n);
        } else {
            System.out.printf("%d는 소수가 아닙니다.", n);
        }
    }
}
