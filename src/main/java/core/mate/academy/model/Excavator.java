package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String engine;
    private int maxSpeedKmH;
    private double bucketMaxLoadKg;

    public Excavator() {
    }

    public Excavator(String engine, int maxSpeedKmH, double bucketMaxLoadKg) {
        this.engine = engine;
        this.maxSpeedKmH = maxSpeedKmH;
        this.bucketMaxLoadKg = bucketMaxLoadKg;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
