package chapter10;

public class SomeCalculator implements Calculatorable {
    @Override
    public int calculate(int val1, int val2) {
        return 10 * val1 - val2;
    }
}