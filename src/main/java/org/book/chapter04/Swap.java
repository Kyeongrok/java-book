package org.book.chapter04;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] iArr = {2, 1, 4, 8, 7, 6};
        int temp = iArr[0]; // 0번에 있는 값 저장
        iArr[0] = iArr[1]; // 0번방에 덮어쓰기
        iArr[1] = temp; // 임시로 저장한 값 1번에 넣기
    }
}
