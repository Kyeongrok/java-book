package org.book.chapter06.p03;

public class IsPrime1 {
    public static void main(String[] args) {
        int num = 6;
        for (int i = 2; i < num; i++) {
            System.out.printf("%d %% %d = %d\n", num, i, num % i);
        }
    }
}
