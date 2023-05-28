package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private String model;
    private int horsePower;
    private double price;

    public Excavator() {

    }

    public Excavator(String model, int horsePower, double price) {
        this.model = model;
        this.horsePower = horsePower;
        this.price = price;
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
        System.out.println("Excavator started to work");
    }
}
