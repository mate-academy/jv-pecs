package core.mate.academy.model;

public class Excavator extends Machine {
    private int sizeOfBucket;

    public Excavator() {
    }

    public Excavator(String name, String color, int sizeOfBucket) {
        super(name, color);
        this.sizeOfBucket = sizeOfBucket;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
