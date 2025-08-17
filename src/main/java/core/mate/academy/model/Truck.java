package core.mate.academy.model;

public class Truck extends Machine {
    private double price;
    private double engineVolume;
    private String owner;

    public Truck(double price, double engineVolume, String owner) {
        this.price = price;
        this.engineVolume = engineVolume;
        this.owner = owner;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
