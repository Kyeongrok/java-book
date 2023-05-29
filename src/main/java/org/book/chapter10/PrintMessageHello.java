package org.book.chapter10;

public class PrintMessageHello extends PrintMessage{
    @Override
    public void greet() {
        System.out.println("Hello!");
    }

    public static void main(String[] args) {
        PrintMessageHello pmh = new PrintMessageHello();
        pmh.repeat(4);
    }
}
