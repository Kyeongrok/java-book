package org.book.chapter05.p06;

public class LogicalOperatorOr {
    public static void main(String[] args) {
        boolean condition1 = true;
        boolean condition2 = false;

        boolean result = condition1 || condition2;
        System.out.printf("condition1 || condition2: %b", result);
    }
}
