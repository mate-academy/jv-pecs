package core.mate.academy.model;

public class Truck extends Machine {
    private int power;
    private String model;

    public Truck(int power, String model) {
        this.power = power;
        this.model = model;
    }

    public Truck() {
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
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
