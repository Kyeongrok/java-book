package org.book.chapter08.questions;

public class ConstructorQuestion {
    private int value;

    public ConstructorQuestion() {
        this.value = 1;
    }

    public ConstructorQuestion(int value) {
        this.value = value;
    }

    public void printValue() {
        System.out.println(value);
    }

    public static void main(String[] args) {
        ConstructorQuestion question = new ConstructorQuestion(2);
        question.printValue();
    }
}
