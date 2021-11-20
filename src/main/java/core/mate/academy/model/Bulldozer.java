package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private double bladeCapacity; //m3
    private double bladeLength; //m
    private int maximumDigDepth; //mm
    private int groundClearance; //mm (at full raise)

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
