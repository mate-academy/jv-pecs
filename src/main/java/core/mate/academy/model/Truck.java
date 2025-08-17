package core.mate.academy.model;

public class Truck extends Machine {
    private int loadCapacity;
    private String cargoType;

    public Truck() {
    }

    public Truck(String name, String color, int loadCapacity, String cargoTypeType) {
        super(name, color);
        this.loadCapacity = loadCapacity;
        this.cargoType = cargoTypeType;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }

    public String getCargoType() {
        return cargoType;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
