package org.book.chapter07;

public class CalculatorOverloadingTest {
    public static void main(String[] args) {
        CalculatorOverloading calculatorOverloading = new CalculatorOverloading();
        int result1 = calculatorOverloading.plus(10, 20);
        int result2 = calculatorOverloading.plus(10, 20, 30);
        float result3 = calculatorOverloading.plus(1.5f, 2.6f);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
    }
}
