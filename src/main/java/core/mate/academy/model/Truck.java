package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String model;
    private int numberOfWeels;

    public Truck(String model, int numberOfWeels) {
        this.model = model;
        this.numberOfWeels = numberOfWeels;
    }

    public Truck() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfWeels() {
        return numberOfWeels;
    }

    public void setNumberOfWeels(int numberOfWeels) {
        this.numberOfWeels = numberOfWeels;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
