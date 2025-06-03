package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private static final String BULLDOZER_TYPE = "Crawler Bulldozer";
    private String bulldozerBlades = "S-Blade";

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
