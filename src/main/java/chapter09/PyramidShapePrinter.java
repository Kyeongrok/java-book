package chapter09;

public class PyramidShapePrinter extends ShapePrinter {
    @Override
    public String makeALine(int h, int n) {
        return " ".repeat(h - n) + "*".repeat(2 * n - 1);
    }
    public static void main(String[] args) {
        PyramidShapePrinter psp = new PyramidShapePrinter();
        psp.draw(5);
    }
}