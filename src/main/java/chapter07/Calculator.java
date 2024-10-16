package chapter07;

public class Calculator {
    public void plus() {
        System.out.println(1 + 1);
    } public void printPlusOne(int num) {
        System.out.println(num + 1);
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.printPlusOne(30);
        calculator.printPlusOne(100);
        calculator.printPlusOne(350);
    }
}