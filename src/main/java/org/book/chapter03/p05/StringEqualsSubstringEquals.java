package org.book.chapter03.p05;

public class StringEqualsSubstringEquals {
    public static void main(String[] args) {
        String str1 = "GOLD";
        String str2 = "G";
        System.out.println(str1.substring(0, 1) == str2);
    }
}
