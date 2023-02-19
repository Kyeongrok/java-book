package org.book.chapter03.p05;

public class StringSubstringKorea3 {
    public static void main(String[] args) {
        String str = "대한민국";
        String subStr = str.substring(2); // 2번 인덱스부터 끝까지 자르기
        System.out.println(subStr); // 출력결과 : 민국

        String subStr2 = str.substring(1, 3); // 1이상 3미만 인덱스 자르기
        System.out.println(subStr2); // 출력결과 : 한민
    }
}
