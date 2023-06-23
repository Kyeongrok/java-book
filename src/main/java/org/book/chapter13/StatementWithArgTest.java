package org.book.chapter13;

public class StatementWithArgTest {
    public static void main(String[] args) {
        StatementWithArg statement = (val) -> val + 20;
        System.out.println("statement.calculate(30) = " + statement.calculate(30));
    }
}
