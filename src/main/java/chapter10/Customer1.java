package chapter10;

public class Customer1 {
    private AudioInterface audioInterface;
    public Customer1(AudioInterface audioInterface) {
        this.audioInterface = audioInterface;
    }
    public void listen() {
        audioInterface.play("analog signal");
    }
}