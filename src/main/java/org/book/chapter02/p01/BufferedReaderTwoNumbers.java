package org.book.chapter02.p01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTwoNumbers {
    public void plusTwoNums() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println(br.readLine() + br.readLine());
    }
}
