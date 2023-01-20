package org.book.chapter02;

import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInput {
    public void readAChar() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        int asciiCode = is.read();
        System.out.println(asciiCode);
    }
}
