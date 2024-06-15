package org.book.chapter10.questions;

public class FactoryTest {
    public static void main(String[] args) {
        KoreanFactory koreanFactory = new KoreanFactory("성남");
        koreanFactory.printFactoryName();
    }
}
