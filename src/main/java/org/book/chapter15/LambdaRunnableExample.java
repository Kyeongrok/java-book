package org.book.chapter15;

public class LambdaRunnableExample {
    public static void main(String[] args) {
        // 람다식을 사용하여 Runnable 인터페이스 구현
        Runnable runnable = () -> {
            // 스레드에서 실행될 코드
            System.out.println("이것은 별도의 스레드에서 실행됩니다.");
        };

        // 새로운 스레드 생성 및 시작
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
