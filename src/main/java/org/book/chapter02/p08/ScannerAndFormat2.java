package org.book.chapter02.p08;

import java.util.Scanner;

public class ScannerAndFormat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        System.out.printf("%,d", val1 * val2);
    }
}
