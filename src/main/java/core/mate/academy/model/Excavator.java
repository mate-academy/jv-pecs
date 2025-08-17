package core.mate.academy.model;

public class Excavator extends Machine {
    private int bucketCapacity;

    public Excavator() {
    }

    public Excavator(int bucketCapacity, String name, String color) {
        this.bucketCapacity = bucketCapacity;
        super.setName(name);
        super.setName(color);
    }

    public int getBucketCapacity() {
        return bucketCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
