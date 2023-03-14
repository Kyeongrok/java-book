package org.book.etc;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.BiPredicate;

public class MaxOop {
    public int get(int[] arr, BiPredicate<Integer, Integer> bp) {
        int targetVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(bp.test(arr[i], targetVal)){
                targetVal = arr[i];
            }
        }
        return targetVal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine(); // 한 줄을 문자열로 입력받음
        String[] numbers = input.split(" "); // 공백을 기준으로 문자열을 분리하여 배열에 저장

        int[] arr = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = Integer.parseInt(numbers[i]); // 문자열을 정수로 변환하여 배열에 저장
        }

        MaxOop maxOop = new MaxOop();
        int max = maxOop.get(arr, (a, b) -> a > b);
        int min = maxOop.get(arr, (a, b) -> a < b);
        System.out.printf("max:%d, min:%d", max, min);
    }
}
