package chapter10;

public class MinTest {
    public static void main(String[] args) {
        int[] arr = {7, 8, 2, 9, 1};
        Changeable minChangeable = new MinChangeable();
        MaxMinWithInter min = new MaxMinWithInter(minChangeable);
        int result = min.find(arr);
        System.out.println("result = " + result);
    }
}