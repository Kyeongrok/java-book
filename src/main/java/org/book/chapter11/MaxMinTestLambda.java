package org.book.chapter11;

public class MaxMinTestLambda {
    public static void main(String[] args) {
        int[] arr = {7, 8, 2, 9, 1};
        MaxMin min = new MaxMin((val1, val2) -> val1 > val2);
        int result = min.find(arr);
        System.out.println("result = " + result);
    }
}
