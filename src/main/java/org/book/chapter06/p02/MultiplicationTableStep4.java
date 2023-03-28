package org.book.chapter06.p02;

public class MultiplicationTableStep4 {
    public static void main(String[] args) {
        for (int j = 2; j <= 4; j++) {
            for (int i = 1; i <= 9; i++) {
                System.out.printf("%d * %d = %d\n",j, i, 2 * i);
            }
            System.out.println("---------------");
        }
    }
}
