package org.book.chapter14;

public interface LambdaTest1 {
    boolean check(int val1);

    default int calculate(int val1, int val2){
        return 0;
    };
}
