package chapter07;

public class CalculatorOverloadingType {
    public int plus(int a, int b) {
        return a + b;
    }
    public int plus(int a, int b, int c) {
        return a + b + c;
    }
    public float plus(float a, float b) {
        return a + b;
    }
}