package org.book.chapter16;

public class StatementWithTwoArgsTest {
    public static void main(String[] args) {
        StatementWithTwoArgs statement = (val1, val2) -> val1 + val2;
        System.out.println(statement.calculate(10, 20));
    }
}
