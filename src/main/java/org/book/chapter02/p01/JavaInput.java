package org.book.chapter02.p01;

import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInput {
    public void readAChar() throws IOException {
        // InputStreamReader라는 클래스를 is라는 이름으로 선언
        InputStreamReader is;

        // InputStreamReader를 인스턴스화
        is = new InputStreamReader(System.in);

        // InputStreamReader에서 한글자를 읽어옴
        int asciiCode = is.read();

        // 읽어온 문자열의 코드를 출력
        System.out.println(asciiCode);
    }
}

