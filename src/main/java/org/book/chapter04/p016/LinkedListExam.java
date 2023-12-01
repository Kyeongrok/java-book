package org.book.chapter04.p016;

import java.util.LinkedList;

public class LinkedListExam {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(); //LinkedList 선언
        linkedList.add(10); // 10넣기
        for (long i = 0; i < 1_000_000_000; i++) {
            linkedList.add(20); // 20넣기
        }
        System.out.println(linkedList.get(0)); // 0번째 출력
        System.out.println(linkedList.get(1)); // 1번째 출력
    }
}
