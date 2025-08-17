package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private int shovelSize;
    private String color;
    private String wheelType;

    public Excavator() {
    }

    public Excavator(int shovelSize, String color, String wheelType) {
        this.shovelSize = shovelSize;
        this.color = color;
        this.wheelType = wheelType;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
