package org.book.chapter03;

import org.book.chapter01.PrintHello;

public class InitializeAClass {
    public static void main(String[] args) {
        PrintHello printHello; // PrintHello 타입으로 변수를 선언
        printHello = new PrintHello(); // PrintHello 클래스를 인스턴스화
        printHello.print(); // .print() 메소드 호출
    }
}
