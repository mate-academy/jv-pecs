package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int excavatorSpeed;
    private String excavatorColor;

    public Excavator() {
    }

    public int getExcavatorSpeed() {
        return excavatorSpeed;
    }

    public void setExcavatorSpeed(int excavatorSpeed) {
        this.excavatorSpeed = excavatorSpeed;
    }

    public String getExcavatorColor() {
        return excavatorColor;
    }

    public void setExcavatorColor(String excavatorColor) {
        this.excavatorColor = excavatorColor;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
