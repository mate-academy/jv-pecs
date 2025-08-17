package core.mate.academy.model;

public class Excavator extends Machine {
    private Double bucketVolume;

    public Excavator() {
    }

    public Excavator(String name, String color, Double bucketVolume) {
        super(name, color);
        this.bucketVolume = bucketVolume;
    }

    public Double getBucketVolume() {
        return bucketVolume;
    }

    public void setBucketVolume(Double bucketVolume) {
        this.bucketVolume = bucketVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
