package org.book.chapter01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class YmdToDmy {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String[] arr = bufferedReader.readLine().split("\\.");
        System.out.printf("%02d-%02d-%d",
                Integer.parseInt(arr[2]),
                Integer.parseInt(arr[1]),
                Integer.parseInt(arr[0])
                );
    }
}
