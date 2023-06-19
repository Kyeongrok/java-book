package org.book.chapter11;

public class CustomerTest {
    public static void main(String[] args) {
        Customer1 audioUser = new Customer1(new HeadPhone());
        Customer2 bluetoothUser = new Customer2(new HeadPhone());
    }
}
