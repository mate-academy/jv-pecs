package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int fuelCapacity;
    private String superPower;

    public Excavator(String name, String color, int fuelCapacity, String superPower) {
        super(name, color);
        this.fuelCapacity = fuelCapacity;
        this.superPower = superPower;
    }

    public Excavator() {
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
