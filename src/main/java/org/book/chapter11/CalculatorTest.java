package org.book.chapter11;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new PlusCalculator();
        System.out.println(calculator.calculate(10, 20));
    }
}
