package org.book.etc.codeup;

import java.util.Scanner;

public class Codeup1270 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = n / 10;
        if( n % 10 != 0) r++;
        System.out.println(r);
    }
}
