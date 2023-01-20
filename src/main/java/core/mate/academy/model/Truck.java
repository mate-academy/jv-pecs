package core.mate.academy.model;

public class Truck extends Machine {
    private int amountWheels;
    private String model;

    public Truck() {
    }

    public Truck(String model, int amountWheels) {
        this.model = model;
        this.amountWheels = amountWheels;
    }

    public int getAmountWheels() {
        return amountWheels;
    }

    public void setAmountWheels(int amountWheels) {
        this.amountWheels = amountWheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
