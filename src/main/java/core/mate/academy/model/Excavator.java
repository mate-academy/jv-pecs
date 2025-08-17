package core.mate.academy.model;

public class Excavator extends Machine {
    private int bucketCapacity;

    public Excavator() {
        this("DefaultModel", "DefaultColor", 0);
    }

    public Excavator(String model, String color, int bucketCapacity) {
        setName(model);
        setColor(color);
        this.bucketCapacity = bucketCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator " + getName() + " is working.");
    }
}
