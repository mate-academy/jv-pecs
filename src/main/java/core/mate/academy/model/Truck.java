package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private double payloadCapacity;
    private double dumpBoxVolume;

    public Truck() {
    }

    public void setPayloadCapacity(double payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }

    public void setDumpBoxVolume(double dumpBoxVolume) {
        this.dumpBoxVolume = dumpBoxVolume;
    }

    public double getPayloadCapacity() {
        return payloadCapacity;
    }

    public double getDumpBoxVolume() {
        return dumpBoxVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
