package org.book.chapter02;

import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInput2 {
    public void readTwoChars() throws IOException {
        // InputStreamReader 선언하면서 인스턴스화
        InputStreamReader is = new InputStreamReader(System.in);
        // 1글자 읽어서 코드 출력
        System.out.println(is.read());
        // 1글자 더 읽어서 출력
        System.out.println(is.read());
    }
}
