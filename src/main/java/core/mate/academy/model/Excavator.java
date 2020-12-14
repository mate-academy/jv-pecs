package core.mate.academy.model;

public class Excavator extends Machine {
    private int bucketCapacity;
    private String typeChassis;

    public Excavator() {
    }

    public int getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(int bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    public String getTypeChassis() {
        return typeChassis;
    }

    public void setTypeChassis(String typeChassis) {
        this.typeChassis = typeChassis;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
