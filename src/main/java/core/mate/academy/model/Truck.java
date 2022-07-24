package core.mate.academy.model;

public class Truck extends Machine {
    private String modelTruck;

    public Truck() {
    }

    public Truck(String name, String color, String modelTruck) {
        super(name, color);
        this.modelTruck = modelTruck;
    }

    public String getModelTruck() {
        return modelTruck;
    }

    public void setModelTruck(String modelTruck) {
        this.modelTruck = modelTruck;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
