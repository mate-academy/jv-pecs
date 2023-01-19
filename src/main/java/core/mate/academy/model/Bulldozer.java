package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private double bladeCapacity;
    private int horsePower;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, double fuelVolume,
                      int horsePower, double bladeCapacity) {
        super(name, color, fuelVolume);
        this.horsePower = horsePower;
        this.bladeCapacity = bladeCapacity;
    }

    public double getBladeCapacity() {
        return bladeCapacity;
    }

    public void setBladeCapacity(double bladeCapacity) {
        this.bladeCapacity = bladeCapacity;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
