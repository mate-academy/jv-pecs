package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int digHeight;
    private int shovelCapacity;

    public Excavator() {
    }

    public void setDigHeight(int digHeight) {
        this.digHeight = digHeight;
    }

    public void setShovelCapacity(int shovelCapacity) {
        this.shovelCapacity = shovelCapacity;
    }

    public int getDigHeight() {
        return digHeight;
    }

    public int getShovelCapacity() {
        return shovelCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
