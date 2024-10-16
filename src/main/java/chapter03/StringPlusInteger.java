package chapter03;

public class StringPlusInteger {
    public static void main(String[] args) {
        String str = "1";
        int num = Integer.parseInt(str);
        int result = 1 + Integer.parseInt("1");
        System.out.println(result);
    }
}