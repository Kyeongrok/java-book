package org.book.chapter12;

public enum Seasons {
    봄(1), 여름(2), 가을(3), 겨울(4);

    private final int value;

    Seasons(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
