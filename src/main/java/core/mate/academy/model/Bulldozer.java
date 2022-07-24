package core.mate.academy.model;

public class Bulldozer extends Machine {
    private String bucketType;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String bucketType) {
        super(name, color);
        this.bucketType = bucketType;
    }

    public String getBucketType() {
        return bucketType;
    }

    public void setBucketType(String bucketType) {
        this.bucketType = bucketType;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
