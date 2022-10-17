package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String size;

    public Bulldozer() {
    }

    public Bulldozer(String size) {
        super();
        this.size = size;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
