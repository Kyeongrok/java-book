package org.book.chapter05.p04;

public class ArraySum {
    public static void main(String[] args) {
        int answer = 0;
        int[] arr = {2, 1, 7, 9};
        answer = answer + arr[0];
        answer = answer + arr[1];
        answer = answer + arr[2];
        answer = answer + arr[3];

        System.out.printf("answer: %d", answer);
    }
}
