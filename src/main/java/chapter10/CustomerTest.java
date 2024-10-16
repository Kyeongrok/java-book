package chapter10;

public class CustomerTest {
    public static void main(String[] args) {
        AudioInterface audioInterface = new HeadPhone();
        Customer1 audioUser = new Customer1(audioInterface);
        BluetoothInterface bluetoothInterface = new HeadPhone();
        Customer2 bluetoothUser = new Customer2(bluetoothInterface);
        audioUser.listen();
        bluetoothUser.listen();
    }
}