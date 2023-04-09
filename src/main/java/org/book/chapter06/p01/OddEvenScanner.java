package org.book.chapter06.p01;

import java.util.Scanner;

public class OddEvenScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if( num % 2 == 0 ){ // 2로 나누었을때 나머지가 0인지
            System.out.println("짝수 입니다.");
        } else {
            System.out.println("홀수 입니다.");
        }
    }
}
