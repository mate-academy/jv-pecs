package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */

public class Bulldozer extends Machine implements Workable {
    private int bulldozerBladeVolume;
    private int manufactureYear;

    public Bulldozer() {
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getBulldozerBladeVolume() {
        return bulldozerBladeVolume;
    }

    public void setBulldozerBladeVolume(int bulldozerBladeVolume) {
        this.bulldozerBladeVolume = bulldozerBladeVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
