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

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
