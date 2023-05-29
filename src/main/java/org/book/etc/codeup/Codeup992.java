package org.book.etc.codeup;

import java.util.Arrays;

public class Codeup992 {
    public static void main(String[] args) {
        String input = """
                1 1 1 1 1 1 1 1 1 1
                1 0 0 1 0 0 0 0 0 1
                1 0 0 1 1 1 0 0 0 1
                1 0 0 0 0 0 0 1 0 1
                1 0 0 0 0 0 0 1 0 1
                1 0 0 0 0 1 0 1 0 1
                1 0 0 0 0 1 2 1 0 1
                1 0 0 0 0 1 0 0 0 1
                1 0 0 0 0 0 0 0 0 1
                1 1 1 1 1 1 1 1 1 1
                """;
        String[] lines = input.split("\n");
        String[] line = lines[0].split(" ");
        System.out.println(Arrays.toString(line));
    }
}
