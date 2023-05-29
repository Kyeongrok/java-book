package org.book.etc.codeup;

public class Codeup1271 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 29, 31, 21};
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // i=0, 3 1
                // i=1, 1 29
                // i=2, 29 31
                // i=3, 31 21
                System.out.println(arr[i]);
            }
        }
    }
}
