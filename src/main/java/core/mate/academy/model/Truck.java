package core.mate.academy.model;

public class Truck extends Machine {
    private String bodyType;
    private int numberOfAxles;

    public Truck() {
    }

    public Truck(String name, String color, String bodyType, int numberOfAxles) {
        this.bodyType = bodyType;
        this.numberOfAxles = numberOfAxles;
        setName(name);
        setColor(color);
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

    public int getNumberOfAxles() {
        return numberOfAxles;
    }

    public void setNumberOfAxles(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }
}
