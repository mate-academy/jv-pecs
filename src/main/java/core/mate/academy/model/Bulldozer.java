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
