package chapter07;

public class MultiplicationTableStatic {
    public static void printMultiplicationTable(int ofN) {
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n",ofN, i, ofN * i);
        }
        System.out.println("--------");
    }
    public static void main(String[] args) {
        printMultiplicationTable(2);
        printMultiplicationTable(4);
        printMultiplicationTable(7);
        printMultiplicationTable(9);
    }
}