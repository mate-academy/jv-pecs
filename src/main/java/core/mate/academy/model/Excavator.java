package core.mate.academy.model;

public class Excavator extends Machine {
    private double diggingDepth;
    private double bucketCapacity;
    private double reachDepth;
    private double armLength;
    private double weight;

    public Excavator() {

    }

    public Excavator(double diggingDepth, double bucketCapacity, double reachDepth,
                     double armLength, double weight) {
        this.diggingDepth = diggingDepth;
        this.bucketCapacity = bucketCapacity;
        this.reachDepth = reachDepth;
        this.armLength = armLength;
        this.weight = weight;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
