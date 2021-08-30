package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int bladeSquare;
    private int track;

    public Bulldozer(int bladeSquare, int track, String name, String color) {
        this.bladeSquare = bladeSquare;
        this.track = track;
        super.setName(name);
        super.setColor(color);
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
