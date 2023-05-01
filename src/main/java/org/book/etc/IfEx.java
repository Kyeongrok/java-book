package org.book.etc;

import java.util.Scanner;

public class IfEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstVal = sc.nextInt();
        int secondVal = sc.nextInt();
        if (firstVal > secondVal) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }
    }
}
