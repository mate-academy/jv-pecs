package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int horsePower;
    private int manufactureYear;

    public Bulldozer() {
    }

    public Bulldozer(int horsPower, int manufactureYear) {
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
        System.out.println("Bulldozer started to work");
    }
}
