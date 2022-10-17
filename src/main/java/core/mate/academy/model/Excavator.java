package core.mate.academy.model;

public class Excavator extends Machine {
    private String bucketColor;
    private int bucketPower;

    public Excavator() {
    }

    public Excavator(String name, String color, String bucketColor, int bucketPower) {
        super(name, color);
        this.bucketColor = bucketColor;
        this.bucketPower = bucketPower;
    }

    public Excavator(String bucketColor, int bucketPower) {
        this.bucketColor = bucketColor;
        this.bucketPower = bucketPower;
    }

    public String getBucketColor() {
        return bucketColor;
    }

    public void setBucketColor(String bucketColor) {
        this.bucketColor = bucketColor;
    }

    public int getBucketPower() {
        return bucketPower;
    }

    public void setBucketPower(int bucketPower) {
        this.bucketPower = bucketPower;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
