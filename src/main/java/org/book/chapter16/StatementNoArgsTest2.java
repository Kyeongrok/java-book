package org.book.chapter16;

public class StatementNoArgsTest2 {
    public static void main(String[] args) {
        StatementNoArgs statementNoArgs1 = () -> {
            int val = 10;
            return val + 20;
        };
        System.out.println(statementNoArgs1.calculate());
    }
}

