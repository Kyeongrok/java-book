package org.book.etc;

public class RandomTest {
    public static void main(String[] args) {
        int max = 10;
        int min = 5;
        int b = (int)(Math.random()*(max-min+1)+min);
        System.out.println(b);
    }
}
