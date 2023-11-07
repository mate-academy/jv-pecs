package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int weightDump;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int weightDump) {
        super(name, color);
        this.weightDump = weightDump;
    }

    public int getWeightDump() {
        return weightDump;
    }

    public void setWeightDump(int weightDump) {
        this.weightDump = weightDump;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
