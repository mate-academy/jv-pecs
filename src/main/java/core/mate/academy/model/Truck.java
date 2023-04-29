package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String model;
    private int horsePower;
    private double price;

    public Truck(String model, int horsePower, double price) {
        this.model = model;
        this.horsePower = horsePower;
        this.price = price;
    }

    public Truck() {

    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
