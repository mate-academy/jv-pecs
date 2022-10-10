package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private String color;
    private int cargo;
    private int fuelPer100Km;

    public Truck() {
        color = "Red";
        cargo = 30;
        fuelPer100Km = 10;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public int getFuelPer100Km() {
        return fuelPer100Km;
    }

    public void setFuelPer100Km(int fuelPer100Km) {
        this.fuelPer100Km = fuelPer100Km;
    }
}
