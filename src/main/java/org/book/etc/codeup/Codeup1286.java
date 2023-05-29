package org.book.etc.codeup;

import java.util.Scanner;

public class Codeup1286 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstValue = sc.nextInt();
        int max = firstValue;
        int maxIdx = 0;
        int min = firstValue;
        int minIdx = 0;

        for (int i = 1; i < 5; i++) {
            int now = sc.nextInt();
            if (now > max) {
                max = now;
                maxIdx = i;
            } else if(now < min){
                min = now;
                minIdx = i;
            }
        }
        System.out.printf("%d\n", max);
        System.out.printf("%d", min);
    }
}
