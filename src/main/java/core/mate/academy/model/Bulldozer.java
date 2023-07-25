package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String ripperType;

    public Bulldozer() {
        super();
    }

    public Bulldozer(String name, String color, String ripperType) {
        super(name, color);
        this.ripperType = ripperType;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
