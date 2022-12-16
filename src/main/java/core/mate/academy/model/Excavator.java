package core.mate.academy.model;

public class Excavator extends Machine {
    private int bucketCapacity;
    private int reachLength;

    public Excavator(int bucketCapacity, int reachLength) {
        this.bucketCapacity = bucketCapacity;
        this.reachLength = reachLength;
    }

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
