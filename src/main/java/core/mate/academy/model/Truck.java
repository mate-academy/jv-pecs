package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String axleConfiguration;
    private int payloadCapacity;
    private int towingCapacity;

    public Truck() {
    }

    public Truck(String axleConfiguration, int payloadCapacity, int towingCapacity) {
        this.axleConfiguration = axleConfiguration;
        this.payloadCapacity = payloadCapacity;
        this.towingCapacity = towingCapacity;
    }

    public String getAxleConfiguration() {
        return axleConfiguration;
    }

    public void setAxleConfiguration(String axleConfiguration) {
        this.axleConfiguration = axleConfiguration;
    }

    public int getPayloadCapacity() {
        return payloadCapacity;
    }

    public void setPayloadCapacity(int payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }

    public int getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(int towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
