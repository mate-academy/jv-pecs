package core.mate.academy.model;

public class Excavator extends Machine {
    private double bucketVolume;

    public Excavator() {
    }

    public void setBucketVolume(double volume) {
        this.bucketVolume = volume;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
