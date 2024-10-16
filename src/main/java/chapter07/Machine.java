package chapter07;

public class Machine {
    long id;
    String name;
    boolean enabled;

    public String onOff() {
        return enabled ? "On" : "Off";
    }
}