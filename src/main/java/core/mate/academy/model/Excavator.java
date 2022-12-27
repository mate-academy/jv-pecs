package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {

    private double radiusOfTurning;
    private double bucketCapacity;
    private String typeOfMobilePlatform;

    public Excavator() {
    }

    public Excavator(double radiusOfTurning, double bucketCapacity, String typeOfMobilePlatform) {
        this.radiusOfTurning = radiusOfTurning;
        this.bucketCapacity = bucketCapacity;
        this.typeOfMobilePlatform = typeOfMobilePlatform;
    }

    public double getRadiusOfTurning() {
        return radiusOfTurning;
    }

    public void setRadiusOfTurning(double radiusOfTurning) {
        this.radiusOfTurning = radiusOfTurning;
    }

    public double getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(double bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    public String getTypeOfMobilePlatform() {
        return typeOfMobilePlatform;
    }

    public void setTypeOfMobilePlatform(String typeOfMobilePlatform) {
        this.typeOfMobilePlatform = typeOfMobilePlatform;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
