package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String numberVin;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, String numberVin) {
        super(name, color);
        this.numberVin = numberVin;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
