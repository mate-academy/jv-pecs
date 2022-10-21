package core.mate.academy.model;

public class Excavator extends Machine {
    private int numberOfBuckets;
    private String excavatorType;

    public Excavator(String name, String color, int numberOfBuckets, String excavatorType) {
        super(name, color);
        this.numberOfBuckets = numberOfBuckets;
        this.excavatorType = excavatorType;
    }

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
