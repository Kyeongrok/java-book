package org.book.chapter08;

public class CafeMenuTest {
    public static void main(String[] args) {
        CafeMenu cafeMenu1 = new CafeMenu("아메리카노", 5000, 10000, "beverage");
        cafeMenu1.printStatus();

        CafeMenu cafeMenu2 = new CafeMenu("딸기케이크", 7500, 7, "cake");
        cafeMenu2.printStatus();
    }
}
