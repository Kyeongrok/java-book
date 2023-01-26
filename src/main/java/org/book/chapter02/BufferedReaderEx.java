package org.book.chapter02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx {
    public void readALine() throws IOException {
        // InputStreamReader 선언 및 초기화
        InputStreamReader isr = new InputStreamReader(System.in);
        // BufferedReader 선언 및 초기화, InputStreamReader태우기
        BufferedReader br = new BufferedReader(isr);
        System.out.println(br.readLine());
        // 한줄 추가해 입력 한번 더 받기
        System.out.println(br.readLine());
    }
}
