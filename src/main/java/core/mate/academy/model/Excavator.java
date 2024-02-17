package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String armRange;
    private String shovelCapacity;

    public Excavator() {
    }

    public Excavator(String armRange, String shovelCapacity) {
        this.armRange = armRange;
        this.shovelCapacity = shovelCapacity;
    }

    public String getArmRange() {
        return armRange;
    }

    public void setArmRange(String armRange) {
        this.armRange = armRange;
    }

    public String getShovelCapacity() {
        return shovelCapacity;
    }

    public void setShovelCapacity(String shovelCapacity) {
        this.shovelCapacity = shovelCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
