package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String bladeType;
    private int bladeLoad;

    public Bulldozer() {
    }

    public Bulldozer(String bladeType, int bladeLoad) {
        this.bladeType = bladeType;
        this.bladeLoad = bladeLoad;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
