package chapter10;

public class MaxMinTest {
    public static void main(String[] args) {
        int[] arr = {7, 8, 2, 9, 1};
// MaxChangeable 주입
        MaxMinWithInter max = new MaxMinWithInter(new MaxChangeable());
// MinChangeable 주입
        MaxMinWithInter min = new MaxMinWithInter(new MinChangeable());
        System.out.println("result max = " + max.find(arr));
        System.out.println("result min = " + min.find(arr));
    }
}