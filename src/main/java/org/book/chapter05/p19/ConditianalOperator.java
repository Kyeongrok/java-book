package org.book.chapter05.p19;

public class ConditianalOperator {
    public static void main(String[] args) {
        int enabled = 1;
        String onOff = enabled == 1 ? "On" : "Off";
        System.out.println(onOff);
    }
}
