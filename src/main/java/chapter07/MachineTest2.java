package chapter07;

public class MachineTest2 {
    public static void main(String[] args) {
        Machine machine1 = new Machine();
        machine1.id = 0;
        machine1.name = "프레스1";
        machine1.enabled = true;
        Machine machine2 = new Machine();
        machine2.id = 1;
        machine2.name = "프레스2";
        machine2.enabled = false;
        System.out.printf("%s %s\n", machine1.name, machine1.onOff());
        System.out.printf("%s %s\n", machine2.name, machine2.onOff());
    }
}