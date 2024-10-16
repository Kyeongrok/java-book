package chapter09;

public class PrintStars {
    public String makeALine(int h, int n) { // 한 출을 만드는 기능 분리
        return "*".repeat(n);
    }
    public void draw(int h) {
        for (int i = 1; i <= h; i++) {
            System.out.println(makeALine(h, i)); // makeALine() 호출
        }
    }
    public static void main(String[] args) {
        PrintStars ps = new PrintStars();
        ps.draw(5);
    }
}