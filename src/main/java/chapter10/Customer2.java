package chapter10;

public class Customer2 {
    private BluetoothInterface bluetoothInterface;
    public Customer2(BluetoothInterface bluetoothInterface) {
        this.bluetoothInterface = bluetoothInterface;
    }
    public void listen() {
        bluetoothInterface.play(1010101);
    }
}