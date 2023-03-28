package core.mate.academy.model;

public class Truck extends Machine {
    private int loadCapacity;
    private String bodyType;

    public Truck(int loadCapacity, String bodyType) {
        this.loadCapacity = loadCapacity;
        this.bodyType = bodyType;
    }

    public Truck() {
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
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
