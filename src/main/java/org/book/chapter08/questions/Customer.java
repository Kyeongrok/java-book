package org.book.chapter08.questions;

public class Customer {
    private int age;

    public Customer() {
        this.age = 18;
    }

    public Customer(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return age >= 18;
    }

    public static void main(String[] args) {
        Customer question = new Customer(17);
        System.out.println(question.isAdult());
    }
}
