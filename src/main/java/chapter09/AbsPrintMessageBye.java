package chapter09;

public class AbsPrintMessageBye extends AbsPrintMessage{
    @Override
    public void greet() {
        System.out.println("Bye!");
    }
    public static void main(String[] args) {
        AbsPrintMessageBye pmh = new AbsPrintMessageBye();
        pmh.repeat(5);
    }
}