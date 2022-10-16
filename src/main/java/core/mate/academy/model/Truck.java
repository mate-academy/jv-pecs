package core.mate.academy.model;

public class Truck extends Machine {
    private int enginePower;

    public Truck() {
    }

    public Truck(String name, String color, int enginePower) {
        super(name, color);
        this.enginePower = enginePower;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
