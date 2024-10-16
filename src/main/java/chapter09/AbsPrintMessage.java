package chapter09;

public abstract class AbsPrintMessage {
    public void repeat(int n) {
        for (int i = 0; i < n; i++) {
            greet();
        }
    }
    public abstract void greet();
}