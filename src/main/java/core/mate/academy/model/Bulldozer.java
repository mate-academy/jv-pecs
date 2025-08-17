package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private int pushWeight;

    public Bulldozer() {
    }

    public Bulldozer(String name, String color, int pushWeight) {
        setName(name);
        setColor(color);
        this.pushWeight = pushWeight;
    }

    @Override
    public void doWork() {
        System.out.println(getColor() + " Bulldozer " + getName() + " started to work");
    }
}
