package org.book.chapter06.p03;

public class Factor3 {
    public static void main(String[] args) {
        int n = 36;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.printf("%d ", i);
            }
        }
    }
}
