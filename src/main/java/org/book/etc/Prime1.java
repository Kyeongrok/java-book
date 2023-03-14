package org.book.etc;

import org.book.chapter02.p01.ScannerWithGuide;

import java.util.Scanner;



public class Prime1 {
    public static boolean isPrime(int num) {

        for (int i = 2; i < num; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (isPrime(num)) {
            System.out.println("소수입니다.");
        } else {
            System.out.println("소수가 아닙니다.");
        }
    }
}
