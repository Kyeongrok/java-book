package org.book.chapter13;

import java.util.Scanner;

public class ExceptionTryCatch {
    public void run() {
        int input;
        do {
            System.out.print("100을 나누어 몫을 구할 숫자를 입력해주세요:");
            input = new Scanner(System.in).nextInt();
            try {
                System.out.printf("%d로 나눈 몫은 %d입니다.\n", input, 100 / input);
            } catch (ArithmeticException e) {
                System.out.printf("%d(으)로 나누는 것은 안됩니다. 다른 숫자를 입력 해주세요.\n", input);
            }
        } while(input != 9);
    }
    public static void main(String[] args) {
        ExceptionTryCatch exceptionDoWhile = new ExceptionTryCatch();
        exceptionDoWhile.run();
    }
}
