package org.book.chapter04;

import java.util.Arrays;

public class TenxTenFor {
    public static void printCross(int n, int m) {
        int[][] arr10x10 = new int[10][10];

        // 1로 바꾸기
        for (int i = 0; i < 10; i++) {
            arr10x10[4][i] = 1;
        }

        // 전체 출력하기
        for (int i = 0; i < 10; i++) {
            System.out.println(Arrays.toString(arr10x10[i]));
        }
    }
    public static void main(String[] args) {
    }
}
