package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private double diameterOfPusherBlade;
    private double bucketDiameter;

    public Bulldozer() {
    }

    public Bulldozer(double diameterOfPusherBlade, double bucketDiameter) {
        this.diameterOfPusherBlade = diameterOfPusherBlade;
        this.bucketDiameter = bucketDiameter;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
