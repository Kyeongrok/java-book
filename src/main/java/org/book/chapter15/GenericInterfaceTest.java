package org.book.chapter15;

public class GenericInterfaceTest<T> {
    public static void main(String[] args) {
        GenericInterface<Float> gi = new GenericInterface<Float>() {
            @Override
            public Float calculate(Float val1, Float val2) {
                return val1 + val2;
            }
        };

        GenericInterface<Float> giLambda = (val1, val2) -> val1 + val2;

        System.out.println(gi.calculate(10.1f, 10.2f));
        System.out.println(giLambda.calculate(10.1f, 20.3f));
    }
}
