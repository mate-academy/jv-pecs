package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {

    private int horsePower;
    private boolean isWheeled;

    public Excavator() {
    }

    public Excavator(String name, String color, int power, boolean isWheeled) {
        super.setName(name);
        super.setColor(color);
        this.horsePower = power;
        this.isWheeled = isWheeled;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
