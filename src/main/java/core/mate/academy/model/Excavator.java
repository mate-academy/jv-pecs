package core.mate.academy.model;

public class Excavator extends Machine {
    private int excavatorCapacity;

    public Excavator() {
    }

    public Excavator(String name, String color, int bucketCapacity) {
        setName(name);
        setColor(color);
        this.excavatorCapacity = bucketCapacity;
    }

    public int getBucketCapacity() {
        return excavatorCapacity;
    }

    public void setBucketCapacity(int bucketCapacity) {
        this.excavatorCapacity = bucketCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

}
