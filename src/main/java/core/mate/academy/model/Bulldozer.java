package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int yearOfEndExploitation;

    public Bulldozer(String name, String color, int yearOfEndExploitation) {
        super(name, color);
        this.yearOfEndExploitation = yearOfEndExploitation;
    }

    public Bulldozer() {
    }

    public int getYearOfEndExploitation() {
        return yearOfEndExploitation;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
