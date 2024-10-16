package chapter07;

public class CalculatorTwoP {
    public void printPlus(int num1, int num2) {
        System.out.println(num1 + num2);
    }
    public static void main(String[] args) {
        CalculatorTwoP calculatorTwoP = new CalculatorTwoP();
        calculatorTwoP.printPlus(10, 20);
        calculatorTwoP.printPlus(20, 30);
    }
}