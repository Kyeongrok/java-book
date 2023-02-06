package org.book.chapter03.p01;

import java.util.Scanner;

public class PrintfWithVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        System.out.printf("%d와(과) %d의 합은 %d입니다.", first, second, first + second);
    }
}
