package core.mate.academy.model;

public class Excavator extends Machine {
    private int bucketCapacity;

    public Excavator() {
        this.bucketCapacity = 1000;
    }

    public Excavator(int bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
