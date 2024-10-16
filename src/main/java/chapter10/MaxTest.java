package chapter10;

public class MaxTest {
    public static void main(String[] args) {
        int[] arr = {7, 8, 2, 9, 1};
        Changeable maxChangeable = new MaxChangeable();
        MaxMinWithInter max = new MaxMinWithInter(maxChangeable);
        int result = max.find(arr);
        System.out.println("result = " + result);
    }
}