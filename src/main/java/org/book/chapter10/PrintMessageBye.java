package org.book.chapter10;

public class PrintMessageBye extends PrintMessage{
    @Override
    public void greet() {
        System.out.println("Bye!");
    }

    public static void main(String[] args) {
        PrintMessageBye pmh = new PrintMessageBye();
        pmh.repeat(4);
        throw new IllegalArgumentException("eee");
    }
}
