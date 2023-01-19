package org.book.chapter01;

public class ArrPrac {
    public static void main(String[] args) {
        String[] arr = new String[3];
        arr[0] = "1";
        arr[1] = "00";
        arr[2] = "21";
        String c = arr[1];
        Integer iVar = Integer.parseInt(c);
        System.out.println(iVar.getClass().getName());
        System.out.printf("%d", iVar);
    }
}
