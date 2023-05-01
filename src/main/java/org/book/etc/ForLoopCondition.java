package org.book.etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForLoopCondition {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] arr = line.split(" ");
        for (int i = 0; !"0".equals(arr[i]); i++) {
            System.out.println(arr[i]);
        }
    }
}
