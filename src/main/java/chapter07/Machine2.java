package chapter07;

public class Machine2 {
    private long id;
    private String name;
    private boolean enabled;
    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public boolean isEnabled() {
        return enabled;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    public String onOff() {
        return enabled ? "On" : "Off";
    }
}