package org.book.etc.codeup;

import java.util.Scanner;

public class JustMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 3; i++) {
            int minValue = sc.nextInt();
            System.out.printf("minValue:%d\n", minValue);
            int scNextInt = sc.nextInt();
            System.out.printf("scNextInt:%d\n", scNextInt);
            if (scNextInt < minValue) {
                System.out.println(sc.nextInt());
            }
        }
    }
}
