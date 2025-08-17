package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int serialNumber;
    private double engineVolume;

    public Excavator() {
    }

    public Excavator(String name, String color, int serialNumber, double engineVolume) {
        super(name, color);
        this.serialNumber = serialNumber;
        this.engineVolume = engineVolume;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
