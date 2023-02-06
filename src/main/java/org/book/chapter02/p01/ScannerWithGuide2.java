package org.book.chapter02.p01;

import java.util.Scanner;

public class ScannerWithGuide2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력을 받기 전 .println()으로 안내문 먼저 출력하기
        System.out.println("2개의 숫자를 입력하세요.");
        System.out.print("첫번째 숫자:"); // 입력하는 순간에도 안내 해주기
        System.out.println("첫번째 숫자는 " + sc.nextInt() + "(을)를 입력했습니다.");
        System.out.print("두번째 숫자:"); // 입력하는 순간에도 안내 해주기
        System.out.println("두번째 숫자는 " + sc.nextInt() + "(을)를 입력했습니다.");
    }
}
