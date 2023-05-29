package org.book.etc.codeup;

import java.util.Arrays;
import java.util.Scanner;

public class Codeup10993 {
    public static void printArr(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[1].length; j++) {
                System.out.printf("%s ", arr[i][j]);
            }
            System.out.printf("\n");
        }
    }
    public static String[][] dummyArr() {
        String input = """
                1 1 1 1 1 1 1 1 1 1
                1 0 0 1 0 0 0 0 0 1
                1 0 0 1 1 1 0 0 0 1
                1 0 0 0 0 0 0 1 0 1
                1 0 0 0 0 0 0 1 0 1
                1 0 0 0 0 1 0 1 0 1
                1 0 0 0 0 1 2 1 0 1
                1 0 0 0 0 1 0 0 0 1
                1 0 0 0 0 0 0 0 0 1
                1 1 1 1 1 1 1 1 1 1
                """;
        String[] lines = input.split("\n");
        String[][] arr = new String[10][10];
        for (int i = 0; i < lines.length; i++) {
            arr[i] = lines[i].split(" ");
        }
        return arr;
    }

    public static String[][] arrFromScanner() {
        Scanner sc = new Scanner(System.in);
        String[][] arr = new String[10][10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextLine().split(" ");
        }
        return arr;
    }
    public static void main(String[] args) {
        String[][] arr = arrFromScanner();
        int row = 1;
        int col = 1;
        for (int i = 0; i < 100; i++) {
            if ("2".equals(arr[row][col])) {
                arr[row][col] = "9";
                break;
            } else if (row < arr.length - 1 && "0".equals(arr[row][col]) && !"1".equals(arr[row][col + 1])) {
                arr[row][col++] = "9";
            } else if (row < arr.length - 1 && "0".equals(arr[row][col]) && "1".equals(arr[row][col + 1])) {
                arr[row++][col] = "9";
            }
        }
        printArr(arr);
    }
}
