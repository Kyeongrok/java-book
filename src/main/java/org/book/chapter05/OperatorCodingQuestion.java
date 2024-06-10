package org.book.chapter05;

public class OperatorCodingQuestion {
    public static void main(String[] args) {
        int seconds = 382;
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        System.out.printf("%d분 %d초\n", minutes, remainingSeconds);
    }
}
