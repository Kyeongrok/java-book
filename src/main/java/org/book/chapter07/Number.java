package org.book.chapter07;

public class Number {
    private int num;

    public Number() {
    }

    public Number(int num) {
        this.num = num;
    }

    public boolean isOdd() {
        return num % 2 != 0;
    }

    public boolean isEven() {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Number num = new Number(11);
        System.out.printf("짝수인지? %b\n", num.isEven());
        System.out.printf("홀수인지? %b\n", num.isOdd());
    }
}
