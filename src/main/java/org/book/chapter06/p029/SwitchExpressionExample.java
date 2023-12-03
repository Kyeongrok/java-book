package org.book.chapter06.p029;

public class SwitchExpressionExample {
    public static void main(String[] args) {
        int month = 11;
        String season = switch (month) {
            case 9, 10, 11 -> "가을";
            default -> null;
        };
    }
}
