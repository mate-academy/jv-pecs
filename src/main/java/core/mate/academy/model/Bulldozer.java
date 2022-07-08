package core.mate.academy.model;

public class Bulldozer extends Machine {
    private int bucketWeight;

    public Bulldozer(String name, String color, int bucketWeight) {
        super(name, color);
        this.bucketWeight = bucketWeight;
    }

    public Bulldozer() {
        super();
    }

    public int getBucketWeight() {
        return bucketWeight;
    }

    public void setBucketWeight(int bucketWeight) {
        this.bucketWeight = bucketWeight;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
