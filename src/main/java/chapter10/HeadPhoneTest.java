package chapter10;

public class HeadPhoneTest {
    public static void main(String[] args) {
        AudioInterface audioInterface = new HeadPhone();
        BluetoothInterface bluetoothInterface = new HeadPhone();
        audioInterface.play("analog signal");
        bluetoothInterface.play(1010101);
    }
}