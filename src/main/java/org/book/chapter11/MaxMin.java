package org.book.chapter11;

public class MaxMin {

    private Changeable changeable;

    public MaxMin(Changeable changeable) {
        this.changeable = changeable;
    }

    public int find(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(changeable.check(result, arr[i])){
                result = arr[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
    }
}
