package org.book.etc.codeup;

public class FlipCross {
    int[][] arr = new int[19][19];

    public void check1(int x, int y) {
        arr[x][y] = 1;
    }

    public void toggle(int x, int y) {
        if(arr[x][y] == 0){
            arr[x][y] = 1;
        }
    }

    public void printArr() {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println("");
        }
    }
}
