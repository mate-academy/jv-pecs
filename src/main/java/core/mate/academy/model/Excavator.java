package core.mate.academy.model;

public class Excavator extends Machine {
    private int lengthOfBucket;
    private String brand;

    public Excavator(String name, String color, int lengthOfBucket, String brand) {
        super(name, color);
        this.lengthOfBucket = lengthOfBucket;
        this.brand = brand;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
