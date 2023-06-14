package org.book.chapter08;

public class Company {
    private int debit;

    public Company() {
        this.debit = 50_000_000;
    }

    public Company(int debit) {
        this.debit = debit;
    }

    public void printDebit() {
        System.out.println("debit = " + debit);
    }
}
