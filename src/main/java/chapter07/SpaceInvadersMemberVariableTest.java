package chapter07;

public class SpaceInvadersMemberVariableTest {
    public static void main(String[] args) {
        SpaceInvadersMemberVariable si = new SpaceInvadersMemberVariable();
        si.moveLeft();
        si.moveRight();
        System.out.println(si.location);
    }
}