package chapter07;

public class Greet {
    private void printHello() {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        Greet greet = new Greet();
        greet.printHello();
    }
}