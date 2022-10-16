package core.mate.academy.model;

public class Excavator extends Machine {
    private int bucketAmount;

    public Excavator() {
    }

    public Excavator(String name, String color, int bucketAmount) {
        super(name, color);
        this.bucketAmount = bucketAmount;
    }

    public int getBucketAmount() {
        return bucketAmount;
    }

    public void setBucketAmount(int bucketAmount) {
        this.bucketAmount = bucketAmount;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
