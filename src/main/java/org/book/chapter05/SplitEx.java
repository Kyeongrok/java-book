package org.book.chapter05;

public class SplitEx {
    public static void main(String[] args) {
        String line = "1 2 10";
        String[] arr = line.split(" ");
        System.out.printf("0:%s 1:%s 2:%s", arr[0], arr[1], arr[2]);
    }
}
