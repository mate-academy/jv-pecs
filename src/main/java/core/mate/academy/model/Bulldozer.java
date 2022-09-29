package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {

    private int horsPower;
    private int manufactureYear;

    public Bulldozer() {
    }

    public Bulldozer(int horsPower, int manufactureYear) {
        this.horsPower = horsPower;
        this.manufactureYear = manufactureYear;
    }

    public int getHorsPower() {
        return horsPower;
    }

    public void setHorsPower(int horsPower) {
        this.horsPower = horsPower;
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
