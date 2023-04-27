package org.book.etc.codeup;

import java.util.Scanner;

public class Codeup1272 {
    static int getNum(int x) {
        if (x % 2 == 1){
            x = x / 2 + 1;
        }else if (x % 2 == 0){
            x = x * 5;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x % 2 == 1) {
            System.out.println(x / 2 + 1);
        } else if (x % 2 == 0) {
            System.out.println(x * 5);
        }
    }
}
