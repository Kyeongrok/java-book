package chapter10;

public class LambdaEx {
    public static void main(String[] args) {
        Changeable changeable = (val1, val2) -> val1 > val2;
        boolean result = changeable.check(10, 20);
        System.out.println("result = " + result);
    }
}