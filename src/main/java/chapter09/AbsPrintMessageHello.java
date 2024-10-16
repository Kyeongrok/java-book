package chapter09;

public class AbsPrintMessageHello extends AbsPrintMessage {
    @Override
    public void greet() {
        System.out.println("Hello!");
    }
    public static void main(String[] args) {
        AbsPrintMessageHello pmh = new AbsPrintMessageHello();
        pmh.repeat(5);
    }
}