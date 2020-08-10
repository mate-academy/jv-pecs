package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String model;
    private int modelYear;

    public Bulldozer() {
    }

    public Bulldozer(String model, int modelYear) {
        this.model = model;
        this.modelYear = modelYear;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
