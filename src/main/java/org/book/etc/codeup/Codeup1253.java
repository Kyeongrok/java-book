package org.book.etc.codeup;

import java.util.Scanner;

public class Codeup1253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int start = Math.min(first, second);
        int end = Math.max(first, second);
        for (int i = start; i <= end; i++) {
            System.out.printf("%d ", i);
        }
    }
}
