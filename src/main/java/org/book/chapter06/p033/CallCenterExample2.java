package org.book.chapter06.p033;

import java.util.Scanner;

public class CallCenterExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.print("메뉴를 선택하세요 (0: 상담원 연결, 1: 요금 안내, 2: AS 접수): ");
            choice = scanner.nextInt();
            System.out.println(choice);

        } while (choice < 0 || choice > 9);
    }
}
