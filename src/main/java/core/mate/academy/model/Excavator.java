package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {

    private int horsPower;
    private int manufactureYear;

    public Excavator() {
    }

    public Excavator(int horsPower, int manufactureYear) {
        this.horsPower = horsPower;
        this.manufactureYear = manufactureYear;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
