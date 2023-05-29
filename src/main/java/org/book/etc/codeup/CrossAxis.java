package org.book.etc.codeup;

public class CrossAxis {
    int[][] arr = new int[19][19];

    public void checkCross(int x, int y) {
        // 행변환 열고정
        for (int i = 0; i < arr.length; i++) {
            arr[i][y] = 1;
        }
        // 행고정 열변환
        for (int i = 0; i < arr.length; i++) {
            arr[x][i] = 1;
        }

    }

    public void printArray() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println("");
        }
    }
}
