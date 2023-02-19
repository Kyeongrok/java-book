package org.book.etc.codeup;

import java.util.Scanner;

public class Main909 {
    public static int calc(int a, int r, int n) {
        int resultPow = (int) Math.pow(r, n);
        System.out.printf("r:%d ^ n:%d, %d\n", r, n, resultPow);
        return resultPow * a;
    }
    public static void main(String[] args) {
        // 2 3 4 넣으면 54 나오게
        Scanner sc = new Scanner(System.in);
        int result;
//        result = calc(sc.nextInt(), sc.nextInt(), sc.nextInt());
        result = calc(2, 3, 4);
        System.out.println(result);
    }
}
