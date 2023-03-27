package org.book.chapter06.p02;

public class SumOfEvens2 {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for (int i = 2; i <= n; i+=2) {
            System.out.println(i);
            sum += i;
        }
        System.out.printf("sum:%d\n", sum);
    }
}
