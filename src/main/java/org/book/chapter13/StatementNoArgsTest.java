package org.book.chapter13;

public class StatementNoArgsTest {
    public static void main(String[] args) {
        int val = 20;
        StatementNoArgs statementNoArgs1 = () -> val + 10;
        System.out.println(statementNoArgs1.calculate());
    }
}

