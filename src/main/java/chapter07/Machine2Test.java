package chapter07;

public class Machine2Test {
    public static void main(String[] args) {
        Machine2 machine2 = new Machine2();
        machine2.setId(0);
        machine2.setName("프레스1");
        machine2.setEnabled(true);
        System.out.println(machine2.onOff());
    }
}