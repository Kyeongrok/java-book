package org.book.chapter14;

public class FloatGeneric implements GenericInterface<Float>{
    @Override
    public Float calculate(Float val1, Float val2) {
        return val1 + val2;
    }
}
