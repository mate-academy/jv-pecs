package core.mate.academy.model;

public class Excavator extends Machine {
    private int bucketCapacity;
    private double armLength;
    private boolean isHydraulic;

    public Excavator() {
    }

    public Excavator(int bucketCapacity, double armLength, boolean isHydraulic) {
        this.bucketCapacity = bucketCapacity;
        this.armLength = armLength;
        this.isHydraulic = isHydraulic;
    }

    public int getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(int bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    public double getArmLength() {
        return armLength;
    }

    public void setArmLength(double armLength) {
        this.armLength = armLength;
    }

    public boolean isHydraulic() {
        return isHydraulic;
    }

    public void setHydraulic(boolean hydraulic) {
        isHydraulic = hydraulic;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
