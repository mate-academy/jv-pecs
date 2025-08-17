package core.mate.academy.model;

public class Excavator extends Machine {
    private double bucketCapacity;
    private double armLength;

    public Excavator() {
    }

    public Excavator(double bucketCapacity, double armLength) {
        this.bucketCapacity = bucketCapacity;
        this.armLength = armLength;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
