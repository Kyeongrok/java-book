package chapter09;

public abstract class ShapePrinter {
    public abstract String makeALine(int h, int n);
    public void draw(int h) {
        for (int i = 1; i <= h; i++) {
            System.out.println(makeALine(h, i));
        }
    }
}