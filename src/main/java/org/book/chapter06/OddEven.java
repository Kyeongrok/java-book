package org.book.chapter06;

public class OddEven {
    public static void main(String[] args) {
        int num = 1;
        if( num % 2 == 0 ){ // 2로 나누었을때 나머지가 0인지
            System.out.println("짝수 입니다.");
        } else {
            System.out.println("홀수 입니다.");
        }
    }
}
