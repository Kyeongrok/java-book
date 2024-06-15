package org.book.chapter10.questions;

public class KoreanFactory extends Factory {

    public KoreanFactory(String factoryName) {
        super(factoryName);
    }

    @Override
    public void printFactoryName() {
        System.out.println("이 공장의 이름은 " + this.name + "입니다.");
    }
}
