package chapter10;

public class PlusCalculator implements Calculatorable {
    @Override
    public int calculate(int val1, int val2) {
        return val1 + val2;
    }
}