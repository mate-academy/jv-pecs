package core.mate.academy.model;

public class Truck extends Machine {
    private String bodyType;
    private double bodyVolume;
    private double loadCapacity;

    public Truck() {
    }

    public Truck(String name, String color,
                 String bodyType, double bodyVolume, double loadCapacity) {
        super(name, color);
        this.bodyType = bodyType;
        this.bodyVolume = bodyVolume;
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public double getBodyVolume() {
        return bodyVolume;
    }

    public void setBodyVolume(double bodyVolume) {
        this.bodyVolume = bodyVolume;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
