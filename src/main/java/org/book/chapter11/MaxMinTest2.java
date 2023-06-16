package org.book.chapter11;

public class MaxMinTest2 {
    public static void main(String[] args) {
        int[] arr = {7, 8, 2, 9, 1};
        MaxMin min = new MaxMin(new Changeable() {
            @Override
            public boolean check(int val1, int val2) {
                return val1 > val2;
            }
        });
        int result = min.find(arr);
        System.out.println("result = " + result);
    }
}
