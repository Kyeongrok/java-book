package org.book.chapter05;

public class SwitchEx {
    public static void main(String[] args) {
        String word = "1 2 3 10 9";
        String[] arr = word.split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
