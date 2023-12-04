package org.book.chapter06.p033;

import java.util.Scanner;

public class CallCenterExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            choice = scanner.nextInt();
            System.out.println(choice);

        } while (choice < 0 || choice > 9);
    }
}
