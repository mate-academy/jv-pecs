package core.mate.academy.model;

public class Truck extends Machine {
    private String engineType;
    private String bodyType;

    public Truck() {
    }

    public Truck(String name, String color, String engineType, String bodyType) {
        setName(name);
        setColor(color);
        this.engineType = engineType;
        this.bodyType = bodyType;
    }

    public String getEngineType() {
        return engineType;
    }

    public String getBodyType() {
        return bodyType;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
