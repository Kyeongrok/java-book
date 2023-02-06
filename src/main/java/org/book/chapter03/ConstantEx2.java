package org.book.chapter03;

public class ConstantEx2 {
    public static void main(String[] args) {
        final int iVal; // 앞에 final을 붙입니다.
        iVal = 1; // 최초에 한번 값을 지정할 수 있습니다.
//        iVal = 2; // 한번 지정한 후 바꿀 수 없습니다.
        System.out.println(iVal);
    }
}