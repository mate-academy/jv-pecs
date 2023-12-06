package core.mate.academy.model;

public class Excavator extends Machine {
    private Double bucketVolume;
    private Double armReach;

    public Excavator() {
    }

    public Excavator(Double bucketVolume, Double armReach) {
        this.bucketVolume = bucketVolume;
        this.armReach = armReach;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    public Double getBucketVolume() {
        return bucketVolume;
    }

    public void setBucketVolume(Double bucketVolume) {
        this.bucketVolume = bucketVolume;
    }

    public Double getArmReach() {
        return armReach;
    }

    public void setArmReach(Double armReach) {
        this.armReach = armReach;
    }
}
