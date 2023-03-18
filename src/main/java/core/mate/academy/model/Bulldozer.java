package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private double operationalWeight;
    private double capacity;
    private String transmissionType;

    public Bulldozer() {
    }

    public Bulldozer(double operationalWeight, double capacity, String transmissionType) {
        this.operationalWeight = operationalWeight;
        this.capacity = capacity;
        this.transmissionType = transmissionType;
    }

    public double getOperationalWeight() {
        return operationalWeight;
    }

    public void setOperationalWeight(double operationalWeight) {
        this.operationalWeight = operationalWeight;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
