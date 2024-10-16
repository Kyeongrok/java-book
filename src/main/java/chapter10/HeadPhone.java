package chapter10;

public class HeadPhone implements AudioInterface, BluetoothInterface {
    @Override
    public void play(String analogSignal) {
        System.out.printf("String 타입의 아날로그 신호 %s가 들어왔습니다. 재생합니다\n", analogSignal);
    }
    @Override
    public void play(int digitalSignal) {
        System.out.printf("int 타입의 디지털 신호 %d가 들어왔습니다. 재생합니다\n", digitalSignal);
    }
}