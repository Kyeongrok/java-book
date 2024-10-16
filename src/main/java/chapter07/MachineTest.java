package chapter07;

public class MachineTest {
    public static void main(String[] args) {
        Machine machine1 = new Machine(); // Machine 인스턴스 생성
        machine1.id = 0; // id 지정
        machine1.name = "프레스1"; // 이름 지정
        machine1.enabled = true; // enabled 지정
        System.out.println(machine1.onOff()); // onOff() 메서드 실행
    }
}