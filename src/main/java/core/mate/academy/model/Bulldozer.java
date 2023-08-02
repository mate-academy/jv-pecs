package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int weightOfDump;
    private int distanceMovementGround;
    private String model;

    public Bulldozer() {
    }

    private Bulldozer(int weightOfDump, int distanceMovementGround, String model) {
        this.weightOfDump = weightOfDump;
        this.distanceMovementGround = distanceMovementGround;
        this.model = model;
    }

    public int getWeightOfDump() {
        return weightOfDump;
    }

    public void setWeightOfDump(int weightOfDump) {
        this.weightOfDump = weightOfDump;
    }

    public int getDistanceMovementGround() {
        return distanceMovementGround;
    }

    public void setDistanceMovementGround(int distanceMovementGround) {
        this.distanceMovementGround = distanceMovementGround;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
