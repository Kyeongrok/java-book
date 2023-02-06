package org.book.chapter04;

public class IsEvenOrOdd {
    public static boolean isEven(int n) {
        boolean bool = n % 2 == 0;
        return bool;
    }
    public static void main(String[] args) {
        System.out.println(isEven(10));
    }
}
