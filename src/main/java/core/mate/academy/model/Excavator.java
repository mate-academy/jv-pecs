package core.mate.academy.model;

public class Excavator extends Machine {
    private double bucketVolume;
    private int enginePower;

    public Excavator() {
    }

    public Excavator(String name, String color, double bucketVolume, int enginePower) {
        this.setName(name);
        this.setColor(color);
        this.bucketVolume = bucketVolume;
        this.enginePower = enginePower;
    }

    public double getBucketVolume() {
        return bucketVolume;
    }

    public void setBucketVolume(double bucketVolume) {
        this.bucketVolume = bucketVolume;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
