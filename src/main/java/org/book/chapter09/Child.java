package org.book.chapter09;

public class Child extends Parent{
    public void whoAmI() {
        System.out.println("Child입니다.");
    }
    public static void main(String[] args) {
        Child child = new Child();
        child.whoAmI();
    }
}
