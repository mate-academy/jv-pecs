package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int workingVolume;
    private String engine;

    public Bulldozer() {
    }

    public Bulldozer(String color, String name, int workingVolume, String engine) {
        super(color, name);
        this.workingVolume = workingVolume;
        this.engine = engine;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
