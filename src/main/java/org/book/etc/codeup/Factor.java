package org.book.etc.codeup;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
//                System.out.printf("%d %% %d = %d\n", n, i, n % i);
                System.out.printf("%d ", i);
            }
        }
    }
}
