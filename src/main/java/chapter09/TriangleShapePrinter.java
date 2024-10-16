package chapter09;

public class TriangleShapePrinter extends ShapePrinter {
    @Override
    public String makeALine(int h, int n) {
        return "*".repeat(n);
    }
    public static void main(String[] args) {
        TriangleShapePrinter tsp = new TriangleShapePrinter();
        tsp.draw(3);
    }
}