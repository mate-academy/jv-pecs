package core.mate.academy.model;

public class Excavator extends Machine {
    private String chassisType;
    private String engineType;
    private double bucketCapacity;

    public Excavator(String chassisType, String engineType, double bucketCapacity) {
        this.chassisType = chassisType;
        this.engineType = engineType;
        this.bucketCapacity = bucketCapacity;
    }

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public String getChassisType() {
        return chassisType;
    }

    public void setChassisType(String chassisType) {
        this.chassisType = chassisType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public double getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(double bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

}
