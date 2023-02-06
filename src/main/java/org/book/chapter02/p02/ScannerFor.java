package org.book.chapter02.p02;

import java.util.Scanner;

public class ScannerFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        for (int i = 0; i < cnt; i++) {
            System.out.println(sc.next());
        }
    }
}
