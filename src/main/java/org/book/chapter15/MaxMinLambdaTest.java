package org.book.chapter15;

import org.book.chapter11.Changeable;
import org.book.chapter11.MaxMin;

public class MaxMinLambdaTest {
    public static void main(String[] args) {
        Changeable maxChangeable = (a, b) -> a < b;
        MaxMin max = new MaxMin(maxChangeable);
        int maxVal = max.find(new int[]{7, 2, 3, 9});
        System.out.println(maxVal);
    }
}
