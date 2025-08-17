package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int year;
    private String countyOfProduction;
    private int powerHorses;

    public Excavator(int year, String countyOfProduction, int powerHorses) {
        this.year = year;
        this.countyOfProduction = countyOfProduction;
        this.powerHorses = powerHorses;
    }

    public int getYear() {
        return year;
    }

    public Excavator setYear(int year) {
        this.year = year;
        return this;
    }

    public String getCountyOfProduction() {
        return countyOfProduction;
    }

    public Excavator setCountyOfProduction(String countyOfProduction) {
        this.countyOfProduction = countyOfProduction;
        return this;
    }

    public int getPowerHorses() {
        return powerHorses;
    }

    public Excavator setPowerHorses(int powerHorses) {
        this.powerHorses = powerHorses;
        return this;
    }

    public Excavator() {
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
