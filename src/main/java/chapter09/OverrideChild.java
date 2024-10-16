package chapter09;

public class OverrideChild extends OverrideParent {
    public void whoAmI() {
        System.out.println("Child입니다.");
    }
    public static void main(String[] args) {
        OverrideChild overrideChild = new OverrideChild();
        overrideChild.whoAmI();
    }
}