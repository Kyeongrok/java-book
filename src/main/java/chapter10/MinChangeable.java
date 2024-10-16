package chapter10;

public class MinChangeable implements Changeable {
    @Override
    public boolean check(int val1, int val2) {
        return val1 > val2;
    }
}