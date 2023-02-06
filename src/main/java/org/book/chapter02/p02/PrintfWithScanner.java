package org.book.chapter02.p02;

import java.util.Scanner;

public class PrintfWithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%d와 %d의 합은 %d입니다.", sc.nextInt(), sc.nextInt());
    }
}
