package org.book.etc.codeup;

import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        for (int i = 0; i < d - 1; i++) {
            a = a * (b) + c;
        }
        System.out.println(a);
    }
}
