package chapter10;

public class MaxWithInter {
    public int findMax(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (result < arr[i]) {
                result = arr[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {7, 8, 2, 9, 1};
        MaxWithInter max = new MaxWithInter();
        int result = max.findMax(arr);
        System.out.println("result = " + result);
    }
}