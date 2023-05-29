package org.book.etc.codeup;

import java.util.Scanner;

public class Codeup1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            arr[sc.nextInt()]++;
        }
//        System.out.println(Arrays.toString(arr));
        for (int i = arr.length - 1; i > 0 ; i--) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
