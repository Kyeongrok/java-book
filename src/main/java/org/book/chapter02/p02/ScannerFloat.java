package org.book.chapter02.p02;

import java.util.Scanner;

public class ScannerFloat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%f", (sc.nextFloat() + sc.nextFloat() + sc.nextFloat()) / 3);
    }
}
