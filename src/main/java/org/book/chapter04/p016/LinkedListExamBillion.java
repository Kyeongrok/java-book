package org.book.chapter04.p016;

import java.util.LinkedList;

public class LinkedListExamBillion {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(); //LinkedList 선언
        for (long i = 0; i < 1_000_000_000; i++) { // 10억개 넣기
            linkedList.add(1);
        }
    }
}
