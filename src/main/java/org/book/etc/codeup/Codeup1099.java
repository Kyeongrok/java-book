package org.book.etc.codeup;

import java.util.Scanner;

public class Codeup1099 {
    public static int[][] arr = new int[11][11];
    public static int x = 2;
    public static int y = 2;

    public static void printArray2() {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[1].length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.printf("\n");
        }
        //System.out.println("-----------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < arr.length ; i++) {
            for (int j = 1; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int x = 2;
        int y = 2;
        for (int i = 0; i < 100; i++) {
            if (x < arr.length - 1 && arr[x][y] == 0 && arr[x][y + 1] != 1) {
                arr[x][y] = 9;
                y++;
            } else if (x < arr.length - 1 && arr[x][y] == 0 && arr[x][y + 1] != 0) {
                arr[x][y] = 9;
                x++;
            } else if(arr[x][y] == 2){
                arr[x][y] = 9;
                break;
            }
        }
        printArray2();
    }
}
