package org.book.chapter06.p02;

public class SumOfEvens {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0){
                System.out.println(i);
                sum += i;
            }
        }
        System.out.printf("sum:%d\n", sum);
    }
}
