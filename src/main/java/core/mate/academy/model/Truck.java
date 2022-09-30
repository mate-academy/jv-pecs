package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int horsePower;
    private int manufactureYear;

    public Truck() {
    }

    public Truck(int horsPower, int manufactureYear) {
        this.horsePower = horsPower;
        this.manufactureYear = manufactureYear;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
