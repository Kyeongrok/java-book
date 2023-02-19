package org.book.chapter02.p01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderDefine {
    public static void main(String[] args) {
        // InputStreamReader 선언 및 초기화
        InputStreamReader isr = new InputStreamReader(System.in);
        // BufferedReader 선언 및 초기화, InputStreamReader태우기
        BufferedReader br = new BufferedReader(isr);
    }
}
