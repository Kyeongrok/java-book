package org.book.chapter08.questions;

public class ConstructorQuestion2 {
    private int value;

    public ConstructorQuestion2() {
        this.value = 1;
    }

    public ConstructorQuestion2(int value) {
        this.value = value;
    }

    public void printValue() {
        System.out.println(value);
    }

    public static void main(String[] args) {
        ConstructorQuestion2 question = new ConstructorQuestion2();
    }
}
