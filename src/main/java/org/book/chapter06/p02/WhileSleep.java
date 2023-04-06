package org.book.chapter06.p02;

import java.time.LocalDateTime;
import static java.lang.Thread.sleep;

public class WhileSleep {
    public static void main(String[] args) throws InterruptedException {
        while (true) {
            System.out.println(LocalDateTime.now());
            sleep(1000);
        }
    }
}
