package org.book.chapter10;

public class PrintStars {
    public String makeALine(int h, int n) {
        return "*".repeat(n);
    }
    public void draw(int h) {
        for (int i = 1; i <= h; i++) {
            System.out.println(makeALine(h, i));
        }
    }
    public static void main(String[] args) {
        PrintStars ps = new PrintStars();
        ps.draw(5);
    }
}
