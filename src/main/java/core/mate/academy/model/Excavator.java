package core.mate.academy.model;

public class Excavator extends Machine {
    private double bucketVolume;

    public Excavator() {
    }

    public Excavator(String name, String color, double bucketVolume) {
        super(name, color);
        this.bucketVolume = bucketVolume;
    }

    public double getBucketVolume() {
        return bucketVolume;
    }

    public void setBucketVolume(double bucketVolume) {
        this.bucketVolume = bucketVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
