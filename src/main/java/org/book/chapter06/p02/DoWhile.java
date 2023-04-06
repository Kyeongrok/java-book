package org.book.chapter06.p02;

import java.time.LocalDateTime;

import static java.lang.Thread.sleep;

public class DoWhile {
    public static void main(String[] args) throws InterruptedException {
        int cnt = 10;
        do {
            System.out.println("do 구간에서 실행");
        }while (cnt < 10);
    }
}
