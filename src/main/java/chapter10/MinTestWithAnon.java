package chapter10;

public class MinTestWithAnon {
    public static void main(String[] args) {
        int[] arr = {7, 8, 2, 9, 1};
        MaxMinWithInter min = new MaxMinWithInter(new Changeable() {
            @Override
            public boolean check(int val1, int val2) {
                return val1 > val2;
            }
        });
        int result = min.find(arr);
        System.out.println("result = " + result);
    }
}