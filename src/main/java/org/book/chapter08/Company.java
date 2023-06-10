package org.book.chapter08;

public class Company {
    private int debit;

    public Company(int debit) {
        this.debit = debit;
    }

    public void printDebit() {
        System.out.println("debit = " + debit);
    }
}
