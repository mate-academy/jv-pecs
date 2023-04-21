package core.mate.academy.model;

public class Excavator extends Machine {
    private int bucketCapacity;
    private int boomLength;

    public Excavator() {
        super("default_name", "default_color");
    }

    public Excavator(String name, String color, int bucketCapacity, int boomLength) {
        super(name, color);
        this.bucketCapacity = bucketCapacity;
        this.boomLength = boomLength;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
