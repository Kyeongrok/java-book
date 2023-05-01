package org.book.etc;

import java.util.Random;

public class RandomIntTest {
    public static void main(String[] args) {
        Random random = new Random();

        int max = 10;
        int min = 5;
        int b = (int)(Math.random()*(max-min+1)+min);
        System.out.println(b);

        System.out.println(random.nextInt(20));
    }
}
