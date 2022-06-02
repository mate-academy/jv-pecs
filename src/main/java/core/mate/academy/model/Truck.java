package core.mate.academy.model;

public class Truck extends Machine {
    private String model;
    private int wheelBase;
    private int horsePower;

    public Truck() {
    }

    public Truck(String name, String color, String model, int wheelBase, int horsePower) {
        setName(name);
        setColor(color);
        this.model = model;
        this.wheelBase = wheelBase;
        this.horsePower = horsePower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWheelBase() {
        return wheelBase;
    }

    public void setWheelBase(int wheelBase) {
        this.wheelBase = wheelBase;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
