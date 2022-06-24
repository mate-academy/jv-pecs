package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int weightOfBulldozer;
    private int heightOfBulldozer;
    private int hoursOfWorkBulldozer;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color,
                     int weightOfBulldozer, int heightOfBulldozer, int hoursOfWorkBulldozer) {
        super(name, color);
        this.weightOfBulldozer = weightOfBulldozer;
        this.heightOfBulldozer = heightOfBulldozer;
        this.hoursOfWorkBulldozer = hoursOfWorkBulldozer;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
