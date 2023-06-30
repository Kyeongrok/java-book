package org.book.chapter13;

public class ExceptionMessage {
    public static String returnNull() {
        return null;
    }

    public static void run() {
        String str = returnNull();
        System.out.println(str.length());
    }
    public static void main(String[] args) {
        run();
    }
}
