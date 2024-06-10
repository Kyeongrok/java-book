package org.book;

public class SwitchExpressionQuestion {
    public static void main(String[] args) {
        int result = switch (2) {
            case 0 -> 0;
            case 1 -> 1;
            default -> -1;
        };
        System.out.println(result);
    }
}
