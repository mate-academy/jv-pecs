package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int horsePower;
    private String fuel;

    public Excavator() {
    }

    public Excavator(int horsePower, String fuel) {
        this.horsePower = horsePower;
        this.fuel = fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
