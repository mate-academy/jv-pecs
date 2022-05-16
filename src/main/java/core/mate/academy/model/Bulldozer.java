package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bulldozerDriverAge;

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public int getBulldozerDriverAge() {
        return bulldozerDriverAge;
    }

    public void setBulldozerDriverAge(int bulldozerDriverAge) {
        this.bulldozerDriverAge = bulldozerDriverAge;
    }
}
