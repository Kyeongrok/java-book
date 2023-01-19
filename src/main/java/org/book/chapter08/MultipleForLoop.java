package org.book.chapter08;

public class MultipleForLoop {
    public static void main(String[] args) {
        int n = 75424;
        String strNum = String.valueOf(n);
        for (int i = 0; i < strNum.length(); i++) {
            int b = Character.getNumericValue(strNum.charAt(i));
            System.out.println(b * Math.pow(10, i));
            System.out.println(i);
        }
    }
}

