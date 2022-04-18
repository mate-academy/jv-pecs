package core.mate.academy.model;

public class Truck extends Machine {
    private String brand;
    private String model;
    private double price;
    private double carryingCapacity;

    public Truck() {
    }

    public Truck(String brand, String model, double price, double carryingCapacity) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.carryingCapacity = carryingCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(double carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
