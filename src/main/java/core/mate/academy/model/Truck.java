package core.mate.academy.model;

public class Truck extends Machine {
    private String model;

    public Truck() {
    }

    public Truck(String name, String color, String modelTruck) {
        super(name, color);
        this.model = modelTruck;
    }

    public String getModelTruck() {
        return model;
    }

    public void setModelTruck(String modelTruck) {
        this.model = modelTruck;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
