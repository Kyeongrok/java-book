package org.book.chapter11;

public class MaxMinTest3 {
    public static void main(String[] args) {
        int[] arr = {7, 8, 2, 9, 1};

        MaxMin max = new MaxMin(new MaxChangeable()); // MaxChangeable주입
        MaxMin min = new MaxMin(new MinChangeable()); // MinChangeable주입
        System.out.println("result max = " + max.find(arr));
        System.out.println("result min = " + min.find(arr));
    }
}
