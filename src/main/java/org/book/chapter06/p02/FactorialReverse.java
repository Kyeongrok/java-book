package org.book.chapter06.p02;

public class FactorialReverse {
    public static void main(String[] args) {
        int n = 5;
        int answer = 1;
        for(int i = n; i >= 1; i--){
            answer *= i;
        }
        System.out.println(answer);
    }
}
