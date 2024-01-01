package org.book.chapter13;

import java.util.Stack;

public class StackOverFlow {
    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println(Integer.MAX_VALUE);
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            st.push(100);
        }
    }
}
