package chapter09;

public class AbsPrintHello {
    public void repeat(int n) {
        // 입력받는 만큼 반복하기 위해 횟수 n을 받습니다.
        for (int i = 0; i < n; i++) {
            greet(); // n만큼 greet() 메서드를 호출합니다.
        }
    }
    public void greet() {
        System.out.println("Hello!");
    }
    public static void main(String[] args) {
        AbsPrintHello ph = new AbsPrintHello();
        ph.repeat(5);
    }
}