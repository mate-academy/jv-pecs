package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int ordinalNumber;

    public Bulldozer() {
    }

    public Bulldozer(int ordinalNumber) {
        this.ordinalNumber = ordinalNumber;
    }

    public int getOrdinalNumber() {
        return ordinalNumber;
    }

    public void setOrdinalNumber(int ordinalNumber) {
        this.ordinalNumber = ordinalNumber;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
