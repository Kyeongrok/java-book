package org.book.chapter13;

public class LambdaEx1 {
    public static void main(String[] args) {
        Statement statement1 = val1 -> val1 + 10;
        System.out.println("statement1 = " + statement1.calculate(10));
    }
}
