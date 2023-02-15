package org.book.chapter03.p05;

public class StringSubstringKorea {
    public static void main(String[] args) {
        String str = "대한민국";
        String subStr = str.substring(0, 2); // 인덱스 0부터 2 이전까지 자르기
        System.out.println(subStr); // 출력결과 : 대한
    }
}
