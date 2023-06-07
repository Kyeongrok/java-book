package org.book.chapter07;

public class CallByValue {

    public int callByValueTest(int value){
        value += 1;
        return value;
    }

    public static void main(String[] args) {
        int val1 = 10;
        CallByValue cbv = new CallByValue();
        int result = cbv.callByValueTest(val1);
        System.out.println("result = " + result);
        System.out.println("val1 = " + val1);
    }
}