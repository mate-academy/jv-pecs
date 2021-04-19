package core.mate.academy.model;

public class Truck extends Machine {
    private String manufacturer;

    public Truck() {
    }

    public Truck(String name, String color, String manufacturer) {
        super(name, color);
        this.manufacturer = manufacturer;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
