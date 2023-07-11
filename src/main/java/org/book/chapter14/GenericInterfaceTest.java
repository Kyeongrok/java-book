package org.book.chapter14;

public class GenericInterfaceTest {
    public static void main(String[] args) {
        GenericInterface<Float> gi = new FloatGeneric();
        System.out.println(gi.calculate(10.1f, 10.2f));
    }
}
