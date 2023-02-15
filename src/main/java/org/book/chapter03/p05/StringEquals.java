package org.book.chapter03.p05;

public class StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "H";
        System.out.println(str1.split("e")[0] == str2);

        String s = "AAa";
        // == 비교 연산자는 false
        System.out.println(s.toUpperCase() == "AAA");
    }
}
