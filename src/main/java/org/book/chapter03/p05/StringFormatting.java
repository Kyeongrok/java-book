package org.book.chapter03.p05;

public class StringFormatting {
    public static void main(String[] args) {
        String name = "김경록";
        int balance = 100000;

        String message = String.format("%s님의 통장 잔고는 %d원 입니다", name, balance);
        System.out.println(message);
    }
}
