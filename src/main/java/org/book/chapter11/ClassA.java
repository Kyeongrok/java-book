package org.book.chapter11;

public class ClassA {
    int power(int value){
        return value ^ 2;
    }
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        System.out.println(classA.power(10));
    }
}
