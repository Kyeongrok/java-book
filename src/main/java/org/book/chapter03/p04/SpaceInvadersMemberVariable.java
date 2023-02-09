package org.book.chapter03.p04;

public class SpaceInvadersMemberVariable {
    int location;
    public void moveLeft() {
        // 왼쪽으로 이동하는 메소드
        location = location - 1;
    }

    public void moveRight() {
        // 오른쪽으로 이동하는 메소드
        location = location + 1;
    }
}
