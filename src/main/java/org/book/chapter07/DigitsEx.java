package org.book.chapter07;

public class DigitsEx {
    public static void main(String[] args) {
        int num = 687;
        int digits = 0;
        while (num > 0) {
            num /= 10;
            digits++;
        }
        System.out.println(digits);
    }
}
