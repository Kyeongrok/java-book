package org.book.etc;

import java.util.Scanner;

public class Max1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine(); // 한 줄을 문자열로 입력받음
        String[] numbers = input.split(" "); // 공백을 기준으로 문자열을 분리하여 배열에 저장

        int[] arr = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = Integer.parseInt(numbers[i]); // 문자열을 정수로 변환하여 배열에 저장
        }

        int answer = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > answer) answer = arr[i];
        }

        System.out.printf("최대값:%d", answer);
    }
}
