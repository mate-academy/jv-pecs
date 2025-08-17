package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String model;
    private int horsePower;
    private double price;

    public Bulldozer(String model, int horsePower, double price) {
        this.model = model;
        this.horsePower = horsePower;
        this.price = price;
    }

    public Bulldozer() {

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
        System.out.println("Bulldozer started to work");
    }
}
