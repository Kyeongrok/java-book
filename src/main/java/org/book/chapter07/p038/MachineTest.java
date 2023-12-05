package org.book.chapter07.p038;

public class MachineTest {
    public static void main(String[] args) {
        Machine machine1 = new Machine();
        machine1.id = 0;
        machine1.name = "프레스1";
        machine1.enabled = true;

        System.out.println(machine1.onOff());

    }
}
