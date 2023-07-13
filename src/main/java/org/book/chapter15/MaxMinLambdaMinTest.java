package org.book.chapter15;

import org.book.chapter11.MaxMin;

public class MaxMinLambdaMinTest {
    public static void main(String[] args) {
        MaxMin min = new MaxMin((a, b) -> a > b);
        int minVal = min.find(new int[]{7, 2, 3, 9});
        System.out.println(minVal);
    }
}
