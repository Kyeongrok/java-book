package chapter10;

public class MaxMinWithInter {
    private Changeable changeable;
    public MaxMinWithInter(Changeable changeable) {
        this.changeable = changeable;
    }
    public int find(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (changeable.check(result, arr[i])) {
                result = arr[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {7, 8, 2, 9, 1};
        Changeable maxChangeable = new MaxChangeable();
        MaxMinWithInter max = new MaxMinWithInter(maxChangeable);
        int result = max.find(arr);
        System.out.println("result = " + result);
        Changeable minChangeable = new MinChangeable();
        MaxMinWithInter min = new MaxMinWithInter(minChangeable);
        result = min.find(arr);
        System.out.println("result = " + result);
    }
}