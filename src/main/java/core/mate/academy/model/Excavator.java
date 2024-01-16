package core.mate.academy.model;

public class Excavator extends Machine {
    private String excavatorType;
    private double bucketCapacity;
    private double boomLength;

    public Excavator() {
    }

    public Excavator(String excavatorType,
                     double bucketCapacity, double boomLength) {
        this.excavatorType = excavatorType;
        this.bucketCapacity = bucketCapacity;
        this.boomLength = boomLength;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
