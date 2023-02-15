package org.book.chapter03.p05;

public class StringFloatTypePlus {
    public static void main(String[] args) {
        String val1 = "1.5";
        String val2 = "2.5";
        float result = Float.parseFloat(val1) + Float.parseFloat(val2);
        System.out.println(result); // 결과 4.0
    }
}
