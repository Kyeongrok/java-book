package chapter06;

public class GetGrade {
    public static void main(String[] args) {
        int score = 75;
        if (score >= 90) { // false
            System.out.println("A");
        } else if (score >= 80) { // false
            System.out.println("B");
        } else if (score >= 70) { // true
            System.out.println("C");
        } else {
            System.out.println("F");
        }
    }
}