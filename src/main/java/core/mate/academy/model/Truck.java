package core.mate.academy.model;

public class Truck extends Machine {
    private int loadCapacity;
    private int velocityMashine;
    private String bodyType;

    public Truck() {
    }

    public Truck(String name, String color, int loadCapacity, int velocityMashine,
                 String bodyType) {
        super(name, color);
        this.loadCapacity = loadCapacity;
        this.velocityMashine = velocityMashine;
        this.bodyType = bodyType;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getVelocityMashine() {
        return velocityMashine;
    }

    public void setVelocityMashine(int velocityMashine) {
        this.velocityMashine = velocityMashine;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
