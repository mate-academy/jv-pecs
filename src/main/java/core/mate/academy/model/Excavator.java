package core.mate.academy.model;

public class Excavator extends Machine implements Workable {
    private String manufacturer;
    private double bucketCapacity;
    private double diggingDepth;
    private int operatingWeight;

    public Excavator() {}

    public Excavator(String manufacturer, double bucketCapacity,
                     double diggingDepth, int operatingWeight) {
        this.manufacturer = manufacturer;
        this.bucketCapacity = bucketCapacity;
        this.diggingDepth = diggingDepth;
        this.operatingWeight = operatingWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(double bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    public double getDiggingDepth() {
        return diggingDepth;
    }

    public void setDiggingDepth(double diggingDepth) {
        this.diggingDepth = diggingDepth;
    }

    public int getOperatingWeight() {
        return operatingWeight;
    }

    public void setOperatingWeight(int operatingWeight) {
        this.operatingWeight = operatingWeight;
    }
}
