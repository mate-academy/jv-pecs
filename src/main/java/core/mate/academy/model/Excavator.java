package core.mate.academy.model;

public class Excavator extends Machine {
    private String bucket;
    private String armActuator;
    private double bucketSize;

    public Excavator() {
    }

    public Excavator(String bucket, String armActuator, double bucketSize) {
        this.bucket = bucket;
        this.armActuator = armActuator;
        this.bucketSize = bucketSize;
    }

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public String getArmActuator() {
        return armActuator;
    }

    public void setArmActuator(String armActuator) {
        this.armActuator = armActuator;
    }

    public double getBucketSize() {
        return bucketSize;
    }

    public void setBucketSize(double bucketSize) {
        this.bucketSize = bucketSize;
    }

    @Override
    public String toString() {
        return "Excavator{"
                + "bucket='" + bucket + '\''
                + ", armActuator='" + armActuator + '\''
                + ", bucketSize=" + bucketSize + '}';
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
