package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int excavatorNumber;
    private int excavatorCapacity;

    public Excavator() {
    }

    public Excavator(int excavatorNumber, int excavatorCapacity) {
        this.excavatorNumber = excavatorNumber;
        this.excavatorCapacity = excavatorCapacity;
    }

    public int getExcavatorNumber() {
        return excavatorNumber;
    }

    public void setExcavatorNumber(int excavatorNumber) {
        this.excavatorNumber = excavatorNumber;
    }

    public int getExcavatorCapacity() {
        return excavatorCapacity;
    }

    public void setExcavatorCapacity(int excavatorCapacity) {
        this.excavatorCapacity = excavatorCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
