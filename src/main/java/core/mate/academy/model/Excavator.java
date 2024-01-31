package core.mate.academy.model;

public class Excavator extends Machine {
    private String chassisType;
    private double bucketCapacity;

    public Excavator() {
    }

    public Excavator(String name, String color, String chassisType, double bucketCapacity) {
        super(name, color);
        this.chassisType = chassisType;
        this.bucketCapacity = bucketCapacity;
    }

    public void setChassisType(String chassisType) {
        this.chassisType = chassisType;
    }

    public void setBucketCapacity(double bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    public String getChassisType() {
        return chassisType;
    }

    public double getBucketCapacity() {
        return bucketCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
