package core.mate.academy.model;

public class Bulldozer extends Machine {

    private int carryingCapacity;

    public Bulldozer(String name, String color, int carryingCapacity) {
        super(name, color);
        this.carryingCapacity = carryingCapacity;
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }
}
