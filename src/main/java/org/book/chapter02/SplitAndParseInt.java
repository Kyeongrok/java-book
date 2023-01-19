package org.book.chapter02;

public class SplitAndParseInt {
    public static void main(String[] args) {
        String str = "4.4.4";
        String[] arr = str.split("\\.");
        String a = arr[0];
        int d = Integer.parseInt(a);
        System.out.printf("%0d", d);
    }
}
