package core.mate.academy.model;

public class Excavator extends Machine {
    private int armLength;
    private boolean isSmall;
    private boolean hasRotatingBucket;

    public Excavator(int armLength, boolean isSmall, boolean hasRotatingBucket,
                     String name, String color) {
        super(name, color);
        this.armLength = armLength;
        this.isSmall = isSmall;
        this.hasRotatingBucket = hasRotatingBucket;
    }

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
