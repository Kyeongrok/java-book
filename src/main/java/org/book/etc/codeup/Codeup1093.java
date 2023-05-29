package org.book.etc.codeup;

import java.util.Arrays;
import java.util.Scanner;

public class Codeup1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[24];
        for (int i = 1; i <= n; i++) {
            arr[sc.nextInt()]++;
        }
//        System.out.println(Arrays.toString(arr));
        for (int i = 1; i < arr.length ; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
