package core.mate.academy.model;

public class Excavator extends Machine {
    private double bucketCapacity;

    public Excavator(String name, int year, double bucketCapacity) {
        super(name, year);
        this.bucketCapacity = bucketCapacity;
    }

    public double getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(double bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
