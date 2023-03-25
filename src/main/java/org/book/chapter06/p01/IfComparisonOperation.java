package org.book.chapter06.p01;

public class IfComparisonOperation {
    public static void main(String[] args) {
        int age = 20;
        boolean isAdult = age >= 18; // boolean타입 변수 선언
        if(isAdult){ // 변수를 if문의 입력값으로 사용
            System.out.println("성인입니다.");
        }

        if(age < 18){ // 비교연산을 if문의 입력값으로 사용
            System.out.println("미성년자입니다.");
        }
    }
}
