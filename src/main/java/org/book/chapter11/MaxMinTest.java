package org.book.chapter11;

public class MaxMinTest {
    public static void main(String[] args) {
        int[] arr = {7, 8, 2, 9, 1};
        Changeable maxChangeable = new MaxChangeable();
        MaxMin max = new MaxMin(maxChangeable);
        int result = max.find(arr);
        System.out.println("result = " + result);
    }
}
