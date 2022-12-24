package core.mate.academy.model;

public class Excavator extends Machine {
    private String bucketCapacity;

    public Excavator(String name, String color, String carryingCapacity) {
        super(name, color);
        this.bucketCapacity = carryingCapacity;
    }

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public String getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(String bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }
}
