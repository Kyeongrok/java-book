package org.book.etc;

public class ForLoopLength {
    public static void main(String[] args) {
        String word = "boy";
        int count = word.length();
        for (int i = 0; i < count; i++) {
            System.out.printf("\'%c\'", word.charAt(i));
        }
    }
}
