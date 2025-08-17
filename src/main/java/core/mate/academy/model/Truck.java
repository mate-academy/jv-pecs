package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int bodyLength;
    private int enginePower;

    public Truck(String name, int bodyLength, int enginePower) {
        super(name);
        this.bodyLength = bodyLength;
        this.enginePower = enginePower;
    }

    public Truck() {
    }

    public int getBodyLength() {
        return bodyLength;
    }

    public void setBodyLength(int bodyLength) {
        this.bodyLength = bodyLength;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
