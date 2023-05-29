package org.book.etc.codeup;

import java.util.Arrays;
import java.util.Scanner;

public class Main1097 {

    public static void swap(int[][] arr, int rowIdx, int columnIdx) {
        if(arr[rowIdx][columnIdx] == 1){
            arr[rowIdx][columnIdx] = 0;
        }else if(arr[rowIdx][columnIdx] == 0){
            arr[rowIdx][columnIdx] = 1;
        };
    }
    public static void axis() {

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[19][19];
        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int n = sc.nextInt();
        for (int k = 0; k < n; k++) {
            int rowIdx = sc.nextInt() - 1;
            int columnIdx = sc.nextInt() - 1;
            // 2열을 1로 채운다
            for (int i = 0; i < arr.length; i++) { // 행을 반복 열을 고정
                swap(arr, i, columnIdx);
            }

            // 3행을 1로 채운다
            for (int j = 0; j < arr.length; j++) {
                swap(arr, rowIdx, j);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println("");
        }
    }
}
