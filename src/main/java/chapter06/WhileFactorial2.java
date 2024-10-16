package chapter06;

public class WhileFactorial2 {
    public static void main(String[] args) {
        int answer = 1;
        int num = 5;
        while (num > 1) {
            answer *= num--;
        }
        System.out.println(answer); // 결과는 한번만 출력
    }
}