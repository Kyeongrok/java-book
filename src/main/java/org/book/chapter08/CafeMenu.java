package org.book.chapter08;

public class CafeMenu {
    private String name;
    private int price;
    private int quantity;
    private String category;

    public CafeMenu(String name, int price, int quantity, String category) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

    public void printStatus() {
        System.out.printf("%s은(는) %s이고 가격은 %d원이고 %d개 남았습니다.\n",
                name, category, price, quantity);
    }
}
