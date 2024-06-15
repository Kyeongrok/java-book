package org.book.chapter10.questions;

public class Factory {
    String name;

    public Factory(String factoryName) {
        this.name = factoryName;
    }

    public void printFactoryName() {
        System.out.println("This factory name is " + name);
    }
}
