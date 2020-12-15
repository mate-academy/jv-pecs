package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bulldozerField;

    public Bulldozer() {
    }

    public int getBulldozerField() {
        return bulldozerField;
    }

    public void setBulldozerField(int bulldozerField) {
        this.bulldozerField = bulldozerField;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
