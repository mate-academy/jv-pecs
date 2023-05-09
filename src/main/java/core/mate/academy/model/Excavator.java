package core.mate.academy.model;

public class Excavator extends Machine {
    private double bucketVolume;
    private int maxDigDepth;
    private int bucketDiggingForce;

    public Excavator() {
    }

    public Excavator(double bucketVolume, int maxDigDepth, int bucketDiggingForce) {
        this.bucketVolume = bucketVolume;
        this.maxDigDepth = maxDigDepth;
        this.bucketDiggingForce = bucketDiggingForce;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
