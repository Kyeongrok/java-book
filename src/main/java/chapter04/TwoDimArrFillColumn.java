package chapter04;

import java.util.Arrays;

public class TwoDimArrFillColumn {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        arr[0][2] = 1; // 0행 2열에 값 할당
        arr[1][2] = 1; // 1행 2열에 값 할당
        arr[2][2] = 1; // 2행 2열에 값 할당
        arr[3][2] = 1; // 3행 2열에 값 할당
        arr[4][2] = 1; // 4행 2열에 값 할당
        for (int i = 0; i < arr.length; i++) {
        // 출력할 때는 행 단위로 출력
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}