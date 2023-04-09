package org.book.chapter06.p02;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            System.out.printf("0~9사이의 값을 입력 하세요.");
            input = sc.nextInt();
        }while (input >= 0 && input <= 9);
    }
}
