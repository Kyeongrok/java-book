package org.book.chapter06.p01;

public class ElseExam2 {
    public static void main(String[] args) {
        int account = 1400;
        if(account >= 1500){
            System.out.println("잔액을 차감 합니다.");
        } else {
            System.out.println("'잔액이 부족합니다.'를 재생합니다.");
        }
    }
}
