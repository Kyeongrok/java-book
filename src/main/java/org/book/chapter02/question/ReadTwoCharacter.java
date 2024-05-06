package org.book.chapter02.question;

import java.io.IOException;
import java.io.InputStreamReader;

public class ReadTwoCharacter {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        System.out.println(reader.read());
        System.out.println(reader.read());
    }
}
