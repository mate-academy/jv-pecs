package core.mate.academy.model;

public class Truck extends Machine {
    private String bodyType;
    private int capacity;
    private int gvw;

    public Truck() {
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getGvw() {
        return gvw;
    }

    public void setGvw(int gvw) {
        this.gvw = gvw;
    }
}
