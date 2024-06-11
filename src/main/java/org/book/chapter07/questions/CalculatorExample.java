package org.book.chapter07.questions;

public class CalculatorExample {

    public int plus(int a, int b) {
        return a + b;
    }
    public int minus(int a, int b) {
        return a - b;
    }
    public long multiple(int a, int b) {
        return (long) a * b;
    }
    public float divide(int a, int b) {
        return (float) a / b;
    }
    public int mod(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        CalculatorExample calculator = new CalculatorExample();
    }
}
