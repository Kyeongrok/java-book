package org.book.chapter13;

import java.sql.SQLOutput;

public class ExceptionEx {
    public static void main(String[] args) {
        try {
            System.out.println(100 / 0);
        } catch (Exception e){
            System.out.println("예외가 발생 하였습니다.");
        }
    }
}
