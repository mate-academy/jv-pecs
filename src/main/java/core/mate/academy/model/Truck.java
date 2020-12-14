package core.mate.academy.model;

public class Truck extends Machine {
    private int liftCapacity;
    private String bodyType;
    private String engineType;

    public Truck() {
        super();
    }

    public Truck(String name, String color, int liftCapacity, String bodyType, String engineType) {
        super(name, color);
        this.liftCapacity = liftCapacity;
        this.bodyType = bodyType;
        this.engineType = engineType;
    }

    public int getLiftCapacity() {
        return liftCapacity;
    }

    public void setLiftCapacity(int liftCapacity) {
        this.liftCapacity = liftCapacity;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
