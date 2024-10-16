package chapter10;

public class MinTestWithLambda {
    public static void main(String[] args) {
        int[] arr = {7, 8, 2, 9, 1};
        MaxMinWithInter min = new MaxMinWithInter((val1, val2) -> val1 > val2);
        int result = min.find(arr);
        System.out.println("result = " + result);
    }
}