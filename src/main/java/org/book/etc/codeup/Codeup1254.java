package org.book.etc.codeup;

import java.util.Scanner;

public class Codeup1254 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char startAlpha = sc.next().charAt(0);
        char endAlpha = sc.next().charAt(0);
        for (char i = startAlpha; i < endAlpha; i++) {
            System.out.printf("%c ", i);
        }
    }
}
