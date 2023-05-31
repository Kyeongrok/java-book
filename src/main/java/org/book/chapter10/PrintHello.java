package org.book.chapter10;

import java.util.ArrayList;
import java.util.List;

public class PrintHello {
    public void repeat(int n) {

        for (int i = 0; i < n; i++) {
            greet();
        }
    }
    public void greet() {
        System.out.println("Hello!");
    }

    public static void main(String[] args) {
        PrintHello ph = new PrintHello();
        ph.repeat(5);
    }
}
