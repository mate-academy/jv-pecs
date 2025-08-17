package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String model;
    private String blade;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String model, String blade) {
        super(name, color);
        this.model = model;
        this.blade = blade;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
