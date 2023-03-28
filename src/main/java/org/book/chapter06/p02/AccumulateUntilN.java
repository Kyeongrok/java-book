package org.book.chapter06.p02;

import java.util.Scanner;

public class AccumulateUntilN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner선언
        int num = sc.nextInt(); // 숫자 1개를 입력 받음
        int answer = 0; // 값이 누적될 변수 선언
        for (int i = 1; i <= num; i++){
            answer += i;
        }
        System.out.println(answer);
    }
}
