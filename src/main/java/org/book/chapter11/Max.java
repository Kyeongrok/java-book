package org.book.chapter11;

public class Max {
    public int findMax(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(result < arr[i]){
                result = arr[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 2, 9, 1};
        Max max = new Max();
        int result = max.findMax(arr);
        System.out.println("result = " + result);
    }
}
