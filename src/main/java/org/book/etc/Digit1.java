package org.book.etc;

import java.util.Scanner;

public class Digit1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            int digit = num % 10; // 일의 자리 수 추출
            sum += digit * digit; // 자릿수 제곱의 합 누적
            num /= 10; // 일의 자리 수 제거
        }

        System.out.printf("자릿수 제곱의 합: %d", sum);
    }
}
