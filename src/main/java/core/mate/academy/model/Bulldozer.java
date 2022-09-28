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

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
