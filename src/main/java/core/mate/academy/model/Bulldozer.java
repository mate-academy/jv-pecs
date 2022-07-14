package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String baseOfBulldozer;

    public Bulldozer(String name, String baseOfBulldozer, String color) {
        this.baseOfBulldozer = baseOfBulldozer;
    }

    public Bulldozer() {
        super();
    }

    public String getBaseOfBulldozer() {
        return baseOfBulldozer;
    }

    public void setBaseOfBulldozer(String baseOfBulldozer) {
        this.baseOfBulldozer = baseOfBulldozer;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
