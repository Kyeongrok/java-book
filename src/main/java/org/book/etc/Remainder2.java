package org.book.etc;

public class Remainder2 {
    public static void main(String[] args) {
        String n = "75245";
        char a = n.charAt(0);
        char b = n.charAt(1);
        char c = n.charAt(2);
        char d = n.charAt(3);
        char e = n.charAt(4);

        System.out.println(a + "0".repeat(4));
        System.out.println(b + "0".repeat(3));
        System.out.println(c + "0".repeat(2));
        System.out.println(d + "0".repeat(1));
        System.out.println(e + "0".repeat(0));

    }
}
