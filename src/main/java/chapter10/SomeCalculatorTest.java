package chapter10;

public class SomeCalculatorTest {
    public static void main(String[] args) {
        Calculatorable plusCalculator = new PlusCalculator();
        Calculatorable someCalculator = new SomeCalculator();
        System.out.println(plusCalculator.calculate(10, 20));
        System.out.println(someCalculator.calculate(20, 30));
    }
}