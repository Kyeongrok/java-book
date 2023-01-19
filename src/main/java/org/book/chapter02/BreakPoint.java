package org.book.chapter02;

import java.util.Scanner;

public class BreakPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[2];
        String str = sc.next();
        str = "a:b";
        String[] array = str.split(":");
        System.out.printf("a:b",array[0],array[1]);

    }
}
