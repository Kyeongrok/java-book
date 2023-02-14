package org.book.chapter03.p05;

public class NarrowingCasting {
    public static void main(String[] args) {
        double dVal = 123.456;
        int iVal = (int) dVal;  // double 타입인 d를 int 타입으로 강제 형변환
        System.out.println("dVal = " + dVal);
        System.out.println("iVal = " + iVal);
    }
}
