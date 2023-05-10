package core.mate.academy.model;

public class Excavator extends Machine {
    private int bucketSize;

    public Excavator(String name, String color, int bucketSize) {
        super(name, color);
        this.bucketSize = bucketSize;
    }

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
