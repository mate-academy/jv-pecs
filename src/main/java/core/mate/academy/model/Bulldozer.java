package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine implements Workable {
    private String bulldozerBladeType;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String bulldozerBladeType) {
        super(name, color);
        this.bulldozerBladeType = bulldozerBladeType;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
