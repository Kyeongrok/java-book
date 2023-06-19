package org.book.chapter11;

public class SomeCalculator implements Calculator{
    @Override
    public int calculate(int val1, int val2) {
        return 10 * val1 - val2;
    }
}
