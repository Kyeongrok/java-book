package org.book.lambda;

import java.util.function.BiPredicate;

public class MaxMin {
    public int get(int[] arr, BiPredicate<Integer, Integer> bp) {
        int targetVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(bp.test(arr[i], targetVal)){

            }
        }
        return 0;
    }

    public static void main(String[] args) {
        MaxMin maxMin = new MaxMin();
        int max = maxMin.get(new int[]{1, 2, 3, 8}, (a, b) -> a > b);

    }
}
