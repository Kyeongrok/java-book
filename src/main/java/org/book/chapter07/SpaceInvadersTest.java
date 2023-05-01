package org.book.chapter07;

public class SpaceInvadersTest {
    public static void main(String[] args) {
        SpaceInvadersMemberVariable simv = new SpaceInvadersMemberVariable();
        simv.moveLeft();
        simv.moveRight();
        System.out.println(simv.location);
    }
}
