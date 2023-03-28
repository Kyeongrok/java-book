package org.book.chapter06.p02;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int answer = 1;
        for(int i = 2; i <= n; i++){
            answer *= i;
        }
        System.out.println(answer);
    }
}
