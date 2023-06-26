package org.book.chapter13;

import java.util.Scanner;

public class ExceptionDoWhile {
    public void run() {
        int input;
        do {
            System.out.print("100을 나누어 몫을 구할 숫자를 입력해주세요:");
            input = new Scanner(System.in).nextInt();
            System.out.printf("%d로 나눈 몫은 %d입니다.\n", input, 100 / input);
        } while(input != 9);
    }
    public static void main(String[] args) {
        ExceptionDoWhile exceptionDoWhile = new ExceptionDoWhile();
        exceptionDoWhile.run();
    }
}
