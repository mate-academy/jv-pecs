package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String chassiType;
    private double dumpWeight;

    public Bulldozer() {
    }

    public Bulldozer(String chassiType, double dumpWeight) {
        this.chassiType = chassiType;
        this.dumpWeight = dumpWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
