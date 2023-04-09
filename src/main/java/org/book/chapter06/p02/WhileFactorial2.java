package org.book.chapter06.p02;

public class WhileFactorial2 {
    public static void main(String[] args) {
        int num = 5;
        int answer = 1;
        while (num > 1){
            answer *= num--;
        }
        System.out.println(answer);
    }
}
