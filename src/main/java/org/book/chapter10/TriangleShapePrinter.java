package org.book.chapter10;

public class TriangleShapePrinter extends ShapePrinter {

    @Override
    public String makeALine(int h, int n) {
        return "*".repeat(n);
    }

    public static void main(String[] args) {
        TriangleShapePrinter rtsp = new TriangleShapePrinter();
        rtsp.draw(3);
    }
}
