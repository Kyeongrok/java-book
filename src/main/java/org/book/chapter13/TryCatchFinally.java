package org.book.chapter13;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            System.out.println(100 / 10);
        } catch (Exception e){
            System.out.println("예외가 발생 하였습니다.");
        } finally {
            System.out.println("finally 블록이 실행 되었습니다.");
        }
    }
}
