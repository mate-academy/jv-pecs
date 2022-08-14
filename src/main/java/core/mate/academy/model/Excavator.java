package core.mate.academy.model;

public class Excavator extends Machine {
    private String bucketCapacity;
    private String driveType;

    public Excavator() {
    }

    public Excavator(String bucketCapacity, String driveType) {
        this.bucketCapacity = bucketCapacity;
        this.driveType = driveType;
    }

    public String getBucketCapacity() {
        return bucketCapacity;
    }

    public void setBucketCapacity(String bucketCapacity) {
        this.bucketCapacity = bucketCapacity;
    }

    public String getDriveType() {
        return driveType;
    }

    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
