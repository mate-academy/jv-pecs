package core.mate.academy.model;

public class Excavator extends Machine {
    private int cargoWeigth;
    private int fuelCapacity;

    public Excavator() {
    }

    public Excavator(int cargoWeigth, int fuelCapacity) {
        this.cargoWeigth = cargoWeigth;
        this.fuelCapacity = fuelCapacity;
    }

    public int getCargoWeigth() {
        return cargoWeigth;
    }

    public void setCargoWeigth(int cargoWeigth) {
        this.cargoWeigth = cargoWeigth;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
