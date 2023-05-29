package org.book.chapter10;

public abstract class PrintMessage {
    public void repeat(int n) {
        for (int i = 0; i < n; i++) {
            greet();
        }
    }

    public abstract void greet();
}
