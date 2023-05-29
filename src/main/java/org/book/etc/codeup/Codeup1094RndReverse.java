package org.book.etc.codeup;

import java.util.Scanner;

public class Codeup1094RndReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = arr.length - 1; i >= 0 ; i--) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
