package core.mate.academy.model;

public class Excavator extends Machine {
    private String typeOfEngine;
    private double bucketCapacity;

    public Excavator() {
    }

    public Excavator(String typeOfEngine, double bucketCapacity) {
        this.typeOfEngine = typeOfEngine;
        this.bucketCapacity = bucketCapacity;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
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
