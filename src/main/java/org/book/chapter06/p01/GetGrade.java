package org.book.chapter06.p01;

public class GetGrade {
    public int plus(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        GetGrade gg = new GetGrade();
        gg.plus(10, 20);

        int score = 90;
        if(score >= 90){
            System.out.println("A");
        } else if(score >= 80){
            System.out.println("B");
        } else if(score >= 70){
            System.out.println("B");
        }

    }
}
