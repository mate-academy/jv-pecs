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
    private int id;

    public Bulldozer() {
    }

    public double getBladeCapacity() {
        return bladeCapacity;
    }

    public void setBladeCapacity(double bladeCapacity) {
        this.bladeCapacity = bladeCapacity;
    }

    public double getBladeLength() {
        return bladeLength;
    }

    public void setBladeLength(double bladeLength) {
        this.bladeLength = bladeLength;
    }

    public int getMaximumDigDepth() {
        return maximumDigDepth;
    }

    public void setMaximumDigDepth(int maximumDigDepth) {
        this.maximumDigDepth = maximumDigDepth;
    }

    public int getGroundClearance() {
        return groundClearance;
    }

    public void setGroundClearance(int groundClearance) {
        this.groundClearance = groundClearance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer " + id + " started to work");
    }

}
