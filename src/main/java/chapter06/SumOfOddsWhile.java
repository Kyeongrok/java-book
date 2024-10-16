package chapter06;

public class SumOfOddsWhile {
    public static void main(String[] args) {
        int n = 10;
        int answer = 0;
        int num = 1;
        while (num <= n) {
            if (num % 2 == 1) answer += num;
            num++;
        }
        System.out.println(answer);
    }
}