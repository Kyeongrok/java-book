package org.book.chapter06.p03;

public class Print1To10Odds {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.printf("%d ", i);
            }
        }
    }
}
