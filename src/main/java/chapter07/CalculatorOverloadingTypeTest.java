package chapter07;

public class CalculatorOverloadingTypeTest {
    public static void main(String[] args) {
        CalculatorOverloadingType calculator = new CalculatorOverloadingType();
        int result1 = calculator.plus(10, 20);
        int result2 = calculator.plus(10, 20, 30);
        float result3 = calculator.plus(1.5f, 2.6f);
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
    }
}