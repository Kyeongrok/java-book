package org.book.etc.codeup;

import java.util.Scanner;

public class Main90 {
    public static void main(String[] args) {
        // 3 * 5 = 15
        // 3 6 9 12
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        System.out.println((d * n) - (d - a));

    }
}
