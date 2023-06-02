package org.book.chapter07;

public class Account {
    int balance = 2000;
    public boolean isSufficient(){ // 리턴타입, 메소드명 변경
        return balance >= 1500;
    }
}
