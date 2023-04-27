package org.book.chapter03.p05;

public class DefineFloatAndDoubleVariable {
    public static void main(String[] args) {
        // float 변수 선언 및 초기화
        float f1 = 3.14f;
        float f2 = 1.23e5f;
        float f3 = 1.23e6f;
        float f4 = 1.23e7f;
        float f5 = 1.23e10f; // 정확하지 않음

        // double 변수 선언 및 초기화
        double d1 = 3.141592653589793;
        double d2 = 1.23e100;

        // float과 double 변수의 계산
        float result1 = f1 * 2.0f;
        double result2 = d1 / 2.0;

        // float과 double 변수의 출력
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);
        System.out.println("f4 = " + f4);
        System.out.println("f5 = " + f5);
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
