package org.book.chapter08;

import java.util.function.BiFunction;

public class Calculator1 {

    public boolean test(int a, int b){
        return a < b;
    }

    public int calc(int[] arr, BiFunction<Integer,Integer,Boolean> condition) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if(condition.apply(max,arr[i])){
                max = arr[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {
        Calculator1 calculator1 = new Calculator1();

        int resultMin = calculator1.calc(new int[]{1, 2}, (a, b) -> a > b);
        int resultMax = calculator1.calc(new int[]{1, 2}, (a, b) -> a < b);

        // CompanyA DataSource
        // CompanyB DataSource

        // 결제 - PG 토스, 카카오페이, 00카드, 이니시스, ...

    }
}
