package org.book.etc;

import java.util.Scanner;

public class ScannerNext {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int d = sc.nextInt();
        int seq = sc.nextInt();
        int r = d * (seq - 1) + a1;
        System.out.println(r);
    }
}
