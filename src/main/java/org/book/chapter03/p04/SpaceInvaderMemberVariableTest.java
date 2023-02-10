package org.book.chapter03.p04;

public class SpaceInvaderMemberVariableTest {
    public static void main(String[] args) {
        SpaceInvadersMemberVariable simv = new SpaceInvadersMemberVariable();
        System.out.println(simv.location); // 멤버변수로 접근

        simv.moveLeft(); // 왼쪽로 이동 -1
        System.out.println(simv.location);

        simv.moveLeft();
        System.out.println(simv.location);
    }
}
