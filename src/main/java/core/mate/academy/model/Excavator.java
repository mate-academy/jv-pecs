package core.mate.academy.model;

public class Excavator extends Machine {
    private double volumeOfBucket;
    private double lengthOfBoom;

    public Excavator() {
    }

    public Excavator(double volumeOfBucket, double lengthOfBoom) {
        this.volumeOfBucket = volumeOfBucket;
        this.lengthOfBoom = lengthOfBoom;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }
}
